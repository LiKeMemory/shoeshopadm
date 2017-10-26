package com.hpe.ssa.service.impl;

import com.hpe.ssa.mapper.SpcifyShoesMapper;
import com.hpe.ssa.pojo.SpcifyShoes;
import com.hpe.ssa.service.SpcShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpcShoeServiceImpl implements SpcShoeService {

    @Autowired
    private SpcifyShoesMapper spcifyShoesMapper;
    @Override
    public int selectSpcShoesNum() {
        return spcifyShoesMapper.selectSpcShoesNum();
    }

    @Override
    public List<SpcifyShoes> selectSpcShoes4List(int index) {
        return spcifyShoesMapper.selectSpcShoes4List(index);
    }

    @Override
    public SpcifyShoes selectSpcShoeDetailById(int spsid) {
        return spcifyShoesMapper.selectSpcShoeDetailById(spsid);
    }
}
