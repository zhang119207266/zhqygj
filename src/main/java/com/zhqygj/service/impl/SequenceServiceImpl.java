package com.zhqygj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zhqygj.domain.Sequence;
import com.zhqygj.mapper.ISequenceMapper;
import com.zhqygj.service.ISequenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


@Service
public class SequenceServiceImpl implements ISequenceService {

    private final ISequenceMapper sequenceMapper;
    private final Logger logger = LoggerFactory.getLogger(SequenceServiceImpl.class);
    private final Map<String, Lock> lockMap = new ConcurrentHashMap<>();

    @Autowired
    public SequenceServiceImpl(ISequenceMapper sequenceMapper) {
        this.sequenceMapper = sequenceMapper;
    }


    @Override
    public String sequence(String bType, String featureCode) {
        int save = sequenceMapper.insertSequence(featureCode);
        if (1 == save) {
            return featureCode + String.format("%04d", 1L);
        }
        Lock lock = lockMap.computeIfAbsent(bType, k -> new ReentrantLock());
        try {
            lock.lock();
            Sequence sequence = sequenceMapper.selectOne(new QueryWrapper<Sequence>().eq("feature_code", featureCode));
            Long serialNum = sequence.getSerialNum();
            sequence.setSerialNum(serialNum + 1);
            sequenceMapper.update(sequence, new UpdateWrapper<Sequence>()
                    .eq("feature_code", featureCode)
                    .eq("serial_num", serialNum));
            return featureCode + String.format("%04d", sequence.getSerialNum());
        } catch (Exception e) {
            logger.error("生成单号失败，单据类型：【{}】，特征码：【{}】", bType, featureCode, e);
        } finally {
            lock.unlock();
        }
        return null;
    }
}