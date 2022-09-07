package com.zhqygj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhqygj.domain.PrgBusiness;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IPrgBusinessMapper extends BaseMapper<PrgBusiness> {

    PrgBusiness business(@Param("bCode") String bCode);
}
