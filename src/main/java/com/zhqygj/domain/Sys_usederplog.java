package com.zhqygj.domain;

import lombok.Data;

/**
 * @Auther: zcy
 * @Date: 2022/8/30 - 8:26
 * @Description: com.zhqygj.domain
 * @version: 1.0
 */
@Data
public class Sys_usederplog {
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    //@TableId(type= IdType.AUTO)
//    @TableId(value ="id", type = IdType.AUTO)
//    private Integer id;
    private String clientname;
    private String softname;
    private String netip;
    private String servername;
    private String serverip;
    private String dataname;
    private String usedip;
    private String usedcode;
    private String hostname;
    private String usedmac;
    private String sqlversion;
    private String erpversion;
}
