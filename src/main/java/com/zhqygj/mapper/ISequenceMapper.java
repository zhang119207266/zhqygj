package com.zhqygj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhqygj.domain.Sequence;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ISequenceMapper extends BaseMapper<Sequence> {

    @Insert("insert into sys_sequence (feature_code, serial_num) select #{featureCode}, 1 where 0 = (select count(id) from sys_sequence where feature_code = #{featureCode} )")
    int insertSequence(@Param("featureCode") String featureCode);
}