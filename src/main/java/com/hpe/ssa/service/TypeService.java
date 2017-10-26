package com.hpe.ssa.service;

import com.hpe.ssa.pojo.Shoes;
import com.hpe.ssa.pojo.Types;

import java.util.List;

public interface TypeService {

    //获取种类总数1
    int selectTypesNum();
    //获取种类管理页面种类列表
    List<Types> selectTypes4List(int index);
    //根据tid获取鞋子详情
    Types selectTypeDetailById(int tid);
}
