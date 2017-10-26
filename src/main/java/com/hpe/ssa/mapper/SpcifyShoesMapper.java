package com.hpe.ssa.mapper;

import com.hpe.ssa.pojo.Brands;

import java.util.List;

public interface SpcifyShoesMapper {
    //获取品牌总数1
    int selectSpcShoesNum();
    //获取品牌管理页面品牌列表
    List<Brands> selectSpcShoes4List(int index);
    //根据bid获取品牌详情
    Brands selectSpcShoeDetailById(int bid);
}
