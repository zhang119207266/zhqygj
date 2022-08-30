package com.zhqygj.controller;

import com.zhqygj.controller.utils.R;
import com.zhqygj.domain.Prg_client;
import com.zhqygj.service.IPrg_clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: zhqygj
 * @author: zcy
 * @create: 2022-08-29 09:18
 **/
@RestController
@RequestMapping("/prg_clients")
public class Prg_clientController {
    @Autowired
    private IPrg_clientService prg_clientService;
    @GetMapping
    public R getAll(){
        return new R(true,prg_clientService.list());
    }

    @PostMapping
    public R save(@RequestBody Prg_client prg_client){
        return new R(prg_clientService.save(prg_client));
    }
  @PutMapping
    public R update(@RequestBody Prg_client prg_client){
        Boolean flag = prg_clientService.save(prg_client);
        return new R( flag,flag?"添加成功^_^":"添加失败-_-!");

    }
    @DeleteMapping
    public R delete(@PathVariable String clientcode){
        return  new R( prg_clientService.removeById(clientcode));
    }
    @GetMapping("{clientcode}")
     public R getById(@PathVariable String clientcode){
        return new R(true,prg_clientService.getById(clientcode));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,prg_clientService.getPage(currentPage,pageSize));
    }
}
