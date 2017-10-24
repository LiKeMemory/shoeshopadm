package com.hpe.ssa.mapper;

import com.hpe.ssa.pojo.Shoes4List;

import java.util.List;

public interface ShoesMapper {
    //获取鞋子总数
    int selectShoesNum();
    //获取商品管理页面鞋子列表
    List<Shoes4List> selectShoes4List(int index);
}
