package com.example.demo3.controller;


import com.example.demo3.entity.Goods;
import com.example.demo3.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    //新增，修改
    @PostMapping("save")
    public boolean save(@RequestBody Goods goods){
        return goodsService.saveGoods(goods);
    }

    //删除
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return goodsService.removeById(id);
    }

    //查询
    @GetMapping("/list")
    public List<Goods> findAll(){
        return goodsService.list();
    }


}
