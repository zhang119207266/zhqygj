package com.zhqygj.domain;

import lombok.Data;


@Data
public class Prg_clientreg {
   //@TableId(value = "serial" )
//   @TableId(value = "serial",type = IdType.AUTO )
  // Integer serial;
    //Date regdate;
    String clientname;
    String clientlxr;
    String clienttel;
    String clientqq;
    String clientaddress;
    String clientinfo;
    String Salesmanname;
    String Salesmanqq;
    String Salesmantel;
}
