package com.example.demo3.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo3.entity.Goods;
import com.example.demo3.mapper.GoodsMapper;
import com.example.demo3.service.GoodsService;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {



    @Override
    public boolean saveGoods(Goods goods) {
        return saveOrUpdate(goods);
    }
}
