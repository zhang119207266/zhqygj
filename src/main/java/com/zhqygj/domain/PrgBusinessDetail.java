package com.zhqygj.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("prg_businessDetail")
public class PrgBusinessDetail {

    private String businessCode;
    private Integer detailNo;
    private String proCode;

    @Override
    public String toString() {
        return "PrgBusinessDetail{" +
                "businessCode='" + businessCode + '\'' +
                ", detailNo=" + detailNo +
                ", proCode='" + proCode + '\'' +
                '}';
    }
}
