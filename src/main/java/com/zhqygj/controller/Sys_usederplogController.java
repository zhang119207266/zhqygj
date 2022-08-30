package com.zhqygj.controller;

import com.zhqygj.controller.utils.R;
import com.zhqygj.domain.Sys_usederplog;
import com.zhqygj.service.ISys_usederplogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: zcy
 * @Date: 2022/8/30 8:43
 * @Description: com.zhqygj.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/usederplogs")
public class Sys_usederplogController {
    @Autowired
    private ISys_usederplogService sys_usederplogService;

    @GetMapping
    public R getAll(){
        return new R(true,sys_usederplogService.list());
    }

    @PostMapping("save")
    public R save(@RequestBody Sys_usederplog sys_Usederplog){
        final boolean save = sys_usederplogService.save(sys_Usederplog);

        return save ? R.ok(): R.faile("caozuoshibai");
    }
    @PutMapping
    public R update(@RequestBody Sys_usederplog sys_Usederplog){
        Boolean flag = sys_usederplogService.save(sys_Usederplog);
        return new R( flag,flag?"添加成功^_^":"添加失败-_-!");
    }
    @DeleteMapping
    public R delete(@PathVariable String clientcode){
        return  new R( sys_usederplogService.removeById(clientcode));
    }
    @GetMapping("{clientcode}")
    public R getById(@PathVariable String clientcode){
        return new R(true,sys_usederplogService.getById(clientcode));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,sys_usederplogService.getPage(currentPage,pageSize));
    }
}




