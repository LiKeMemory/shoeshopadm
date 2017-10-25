package com.hpe.ssa.service.impl;

import com.hpe.ssa.mapper.ShoesMapper;
import com.hpe.ssa.pojo.Shoes;
import com.hpe.ssa.pojo.Shoes4List;
import com.hpe.ssa.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoeServiceImpl implements ShoeService {

    @Autowired
    private ShoesMapper shoesMapper;
    @Override
    public List<Shoes4List> selectShoes4List(int index) {

        return shoesMapper.selectShoes4List(index);
    }

    @Override
    public Shoes selectShoeDetailById(int sid) {
        return shoesMapper.selectShoeDetailById(sid);
    }

    @Override
    public int selectShoesNum() {
        return shoesMapper.selectShoesNum();
    }
}
