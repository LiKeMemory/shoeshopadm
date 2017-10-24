package com.hpe.ssa.service;

import com.hpe.ssa.pojo.Shoes4List;

import java.util.List;

public interface ShoeService {
    //获取鞋子总数1
    int selectShoesNum();
    //获取商品管理页面鞋子列表
    List<Shoes4List> selectShoes4List(int index);
}
