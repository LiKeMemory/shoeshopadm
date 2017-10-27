package com.hpe.ssa.service;

import com.hpe.ssa.pojo.SpcifyShoes;

import java.util.List;

public interface SpcShoeService {
    //获取定制鞋子总数
    int selectSpcShoesNum();
    //获取定制鞋子管理页面定制鞋子列表
    List<SpcifyShoes> selectSpcShoes4List(int index);
    //根据spsid获取定制鞋子详情
    SpcifyShoes selectSpcShoeDetailById(int spsid);

    int insertSpcShoe(SpcifyShoes spcifyShoe);
}
