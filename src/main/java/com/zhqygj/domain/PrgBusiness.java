package com.zhqygj.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@TableName("prg_business")
public class PrgBusiness {

    private String businessCode;
    private LocalDateTime billDate;
    private String modeCode;

    private List<PrgBusinessDetail> businessDetails;

    @Override
    public String toString() {
        return "PrgBusiness{" +
                "businessCode='" + businessCode + '\'' +
                ", billDate=" + billDate +
                ", modeCode='" + modeCode + '\'' +
                '}';
    }
}
