package com.zhqygj.domain;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Prg_client {
    @TableId("clientcode")
    private String clientcode;
    private String clientname;
    private String Contacts;
    private String clienttel;
}
