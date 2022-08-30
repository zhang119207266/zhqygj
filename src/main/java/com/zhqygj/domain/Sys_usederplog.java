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
    String clientname;
    String softname;
    String netip;
    String servername;
    String serverip;
    String dataname;
    String usedip;
    String usedcode;
    String hostname;
    String usedmac;
    String sqlversion;
    String erpversion;
}
