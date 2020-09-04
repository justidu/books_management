package com.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import com.Dao.AdminDao;
import com.Entity.Admin;

/**
 * 管理员数据访问接口 实现类
 * @author songdu
 *
 */
public class AdminDaoImpl implements AdminDao {
	List<Admin> adminList = new ArrayList<Admin>();

	public void init() {
		Admin adm1 = new Admin(1, "admin", "123456");
		adminList.add(adm1);
	}

	@Override
	public List<Admin> AdminList() {
		return adminList;
	}

	@Override
	public boolean insert(Admin admin) {
		return adminList.add(admin);
	}
}
