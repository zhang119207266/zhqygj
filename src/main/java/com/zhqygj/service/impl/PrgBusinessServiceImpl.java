package com.zhqygj.service.impl;

import com.zhqygj.domain.PrgBusiness;
import com.zhqygj.mapper.IPrgBusinessMapper;
import com.zhqygj.service.IPrgBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrgBusinessServiceImpl implements IPrgBusinessService {

    private final IPrgBusinessMapper prgBusinessMapper;

    @Autowired
    public PrgBusinessServiceImpl(IPrgBusinessMapper prgBusinessMapper) {
        this.prgBusinessMapper = prgBusinessMapper;
    }

    @Override
    public PrgBusiness business(String bCode) {
        return prgBusinessMapper.business(bCode);
    }
}
