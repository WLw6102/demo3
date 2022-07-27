package com.example.demo3.entity;

import lombok.Data;

@Data
public class Goods  {
    private Integer id;
    private  String goodsName;
    private Long goodsPrice;
    private Long goodsCount;
}
