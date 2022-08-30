package com.zhqygj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhqygj.domain.Prg_clientreg;

/**
 * @Auther: zcy
 * @Date: 2022-08-29 20:31
 * @Description: com.zhqygj.service
 * @version: 1.0
 */
public interface IPrg_clinetregService extends IService<Prg_clientreg> {

    IPage<Prg_clientreg> getPage(int currentPage, int pageSize);
}

