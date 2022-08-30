package com.zhqygj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhqygj.domain.Sys_usederplog;

/**
 * @Auther: zcy
 * @Date: 2022/8/30 8:38
 * @Description: com.zhqygj.service
 * @version: 1.0
 */
public interface ISys_usederplogService extends IService<Sys_usederplog> {
    IPage<Sys_usederplog> getPage(int currentPage, int pageSize);
}
