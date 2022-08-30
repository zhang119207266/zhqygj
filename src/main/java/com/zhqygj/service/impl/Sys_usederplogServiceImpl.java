package com.zhqygj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhqygj.dao.Prg_clientDao;
import com.zhqygj.dao.Sys_usederplogDao;
import com.zhqygj.domain.Prg_client;
import com.zhqygj.domain.Sys_usederplog;
import com.zhqygj.service.IPrg_clientService;
import com.zhqygj.service.ISys_usederplogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: zcy
 * @Date: 2022/8/30 8:39
 * @Description: com.zhqygj.service.impl
 * @version: 1.0
 */
@Service
public class Sys_usederplogServiceImpl extends ServiceImpl<Sys_usederplogDao, Sys_usederplog> implements ISys_usederplogService {
    @Autowired
    private  Sys_usederplogDao sysUsederplogDao;
    @Override
    public IPage<Sys_usederplog> getPage(int currentPage,int pageSize){
        IPage page = new Page(currentPage,pageSize);
        sysUsederplogDao.selectPage(page,null);
        return page;
    }
}

