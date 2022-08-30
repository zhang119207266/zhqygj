package com.zhqygj.controller;

import com.zhqygj.controller.utils.R;
import com.zhqygj.domain.Prg_clientreg;
import com.zhqygj.service.IPrg_clinetregService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: zcy
 * @Date: 2022-08-29 20:33
 * @Description: com.zhqygj.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/clientregs")

public class Prg_clientregController {
    @Autowired
    private IPrg_clinetregService prg_clinetregService;

    @GetMapping
    public R getAll(){
        return new R(true,prg_clinetregService.list());
    }

    @PostMapping
    public R save(@RequestBody Prg_clientreg prg_clientreg){
        return new R(true,prg_clinetregService.save(prg_clientreg));
    }
    @PutMapping
    public R update(@RequestBody Prg_clientreg prg_clientreg){
        Boolean flag = prg_clinetregService.save(prg_clientreg);
        return new R( flag,flag?"添加成功^_^":"添加失败-_-!");

    }
    @DeleteMapping
    public R delete(@PathVariable String clientcode){
        return  new R( prg_clinetregService.removeById(clientcode));
    }
    @GetMapping("{clientcode}")
    public R getById(@PathVariable String clientcode){
        return new R(true,prg_clinetregService.getById(clientcode));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,prg_clinetregService.getPage(currentPage,pageSize));
    }

}
