package com.hpe.ssa.mapper;

import com.hpe.ssa.pojo.ShoeSizes;
import com.hpe.ssa.pojo.Shoes;
import com.hpe.ssa.pojo.Shoes4List;

import java.util.List;

public interface ShoesMapper {
    //获取鞋子总数1
    int selectShoesNum();
    //获取商品管理页面鞋子列表
    List<Shoes4List> selectShoes4List(int index);
    //根据sid获取鞋子详情
    Shoes selectShoeDetailById(int sid);

    int insertSelective(Shoes shoe);

    int insertShoeSize(List<ShoeSizes> list);
}
