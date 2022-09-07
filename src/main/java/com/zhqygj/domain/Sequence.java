package com.zhqygj.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@TableName("sys_sequence")
public class Sequence {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String featureCode;
    private Long serialNum;


}
