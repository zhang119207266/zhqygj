package com.zhqygj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhqygj.dao.Prg_clientDao;
import com.zhqygj.domain.Prg_client;
import com.zhqygj.service.IPrg_clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: zhqygj
 * @author: zcy
 * @create: 2022-08-29 08:58
 **/
@Service
public class Prg_clientServiceImpl extends ServiceImpl<Prg_clientDao, Prg_client> implements IPrg_clientService {

    @Autowired
    private  Prg_clientDao prg_clientDao;
    @Override
    public IPage<Prg_client> getPage(int currentPage,int pageSize){
        IPage page = new Page(currentPage,pageSize);
        prg_clientDao.selectPage(page,null);
        return page;
    }
}
