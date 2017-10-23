package com.hpe.ssa.service;

import java.util.List;
import com.hpe.ssa.pojo.Admins;


public interface AdminsService {
	//管理员登录
	public Admins login(Admins admins);
	//新增管理员
	public int addAdmins(Admins admins);
	//修改管理员
	public int updateAdmins(Admins admins);
	//删除管理员
	public int deleteAdmins(Admins admins);
	//根据ID获取管理员信息
	public Admins getAdminsById(int id);
	//获取管理员列表
	public List<Admins> getAdminsList();
}
