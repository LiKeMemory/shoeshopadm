package com.hpe.ssa.mapper;

import com.hpe.ssa.pojo.SpcifyShoes;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SpcifyShoesMapper {
    //获取定制鞋子总数
    int selectSpcShoesNum();
    //获取定制鞋子管理页面定制鞋子列表
    List<SpcifyShoes> selectSpcShoes4List(int index);
    //根据spsid获取定制鞋子详情
    SpcifyShoes selectSpcShoeDetailById(int spsid);
}
