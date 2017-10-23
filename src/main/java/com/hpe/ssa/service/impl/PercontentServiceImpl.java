package com.hpe.ssa.service.impl;

import java.util.List;

import com.hpe.ssa.service.PercontentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpe.ssa.mapper.AdminsMapper;
import com.hpe.ssa.mapper.PercontentMapper;
import com.hpe.ssa.pojo.Admins;
import com.hpe.ssa.pojo.Percontent;

@Service
public class PercontentServiceImpl implements PercontentService {
	
	@Autowired
	private PercontentMapper percontentMapper;
	@Override
	public List<Percontent> getPercontentList(int pc_perid) {
		return percontentMapper.getPercontentList(pc_perid);
	}
	

}
