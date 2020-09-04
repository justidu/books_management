package com.Dao;

import java.util.List;

import com.Entity.Book;

/**
 * 图书数据访问接口
 * @author songdu
 *
 */
public interface BookDao {
	public List<Book> getAllList(); // 获取所有图书

	public boolean addBook(Book book); //添加图书

	public boolean deleteBook(Book book); //删除图书

	public boolean updateBook(Book book); //  更改图书信息
}
