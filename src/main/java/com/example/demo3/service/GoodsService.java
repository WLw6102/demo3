package com.example.demo3.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo3.entity.Goods;

public interface GoodsService extends IService<Goods> {
    boolean saveGoods(Goods goods);
}
