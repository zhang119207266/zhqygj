package com.zhqygj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhqygj.dao.Prg_clientregDao;
import com.zhqygj.domain.Prg_clientreg;
import com.zhqygj.service.IPrg_clinetregService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: zcy
 * @Date: 2022-08-29 20:30
 * @Description: com.zhqygj.service.impl
 * @version: 1.0
 */
@Service
public class Prg_clientregServerImpl extends ServiceImpl<Prg_clientregDao, Prg_clientreg> implements IPrg_clinetregService {


    @Autowired
    private Prg_clientregDao prg_clientregDao;
    @Override
    public IPage<Prg_clientreg> getPage(int currentPage, int pageSize){
        IPage page = new Page(currentPage,pageSize);
        prg_clientregDao.selectPage(page,null);
        return page;
    }
}
