package com.hpe.ssa.service;

import java.util.List;

import com.hpe.ssa.pojo.Percontent;

public interface PercontentService {
	//获取权限菜单列表
	public List<Percontent> getPercontentList(int pc_perid);
}
