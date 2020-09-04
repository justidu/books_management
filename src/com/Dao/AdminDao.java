package com.Dao;
/**
 * 管理员接口类
 * @author songdu
 *
 */

import java.util.List;

import com.Entity.Admin;

public interface AdminDao {
	public List<Admin> AdminList();
	public boolean insert(Admin admin);
}
