package com.zhqygj.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhqygj.domain.Prg_client;

/**
 * @program: zhqygj
 * @author: zcy
 * @create: 2022-08-29 08:51
 **/
public interface IPrg_clientService extends IService<Prg_client> {
    IPage<Prg_client> getPage(int currentPage,int pageSize);
}
