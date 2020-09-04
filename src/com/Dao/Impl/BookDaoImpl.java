package com.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import com.Dao.BookDao;
import com.Entity.Book;

/**
 * 图书数据访问接口 实现类
 * @author songdu
 *
 */
public class BookDaoImpl implements BookDao {
	List<Book> bookList = new ArrayList<Book>();

	// 初始化
	public void init() {
		Book book1 = new Book("ISBN1001", "西游记", "吴承恩", 100, "人民出版社", 20);
		Book book2 = new Book("ISBN1002", "假如给我三天光明", "张三", 100, "合肥出版社", 15);
		Book book3 = new Book("ISBN1003", "红楼梦", "李四", 100, "人民出版社", 25);
		Book book4 = new Book("ISBN1004", "钢铁是怎样炼成的", "翠花", 100, "北京出版社", 10);
		Book book5 = new Book("ISBN1005", "三国志", "王五", 100, "人民出版社", 30);
		Book book6 = new Book("ISBN1006", "三国演义", "王五", 100, "人民出版社", 30);

		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
	}

	@Override
	public List<Book> getAllList(){
		return bookList;
	}
	@Override
	public boolean addBook(Book book) {
		return bookList.add(book);
	}
	@Override
	public boolean updateBook(Book book) {
		return false;
	}
	@Override
	public boolean deleteBook(Book book) {
		return false;
	}
}
