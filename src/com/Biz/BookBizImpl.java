package com.Biz;

/**
 * 
 * @author songdu
 *
 */

import java.util.List;

import com.Dao.Impl.AdminDaoImpl;
import com.Dao.Impl.BookDaoImpl;
import com.Entity.Admin;
import com.Entity.Book;

public class BookBizImpl {
	public BookDaoImpl bdi = new BookDaoImpl();
	public AdminDaoImpl adi = new AdminDaoImpl();
	List<Admin> admList = adi.AdminList();
	List<Book> bookList = bdi.getAllList();
	Book book = new Book();

	public Admin getAdminById(String adid) {
		for (int i = 0; i < admList.size(); i++) {
			Admin admtemp = admList.get(i);
			if (admtemp.getAdid().equals(adid)) {
				return admtemp;
			}
		}
		return null;
	}

	/**
	 * 查询所有图书
	 */
	public void showAllBook() {
		int sum =0;
		System.out.println("本图书馆共有" + bookList.size() + "种书");
		for (int i = 0;i<bookList.size();i++) {
			Book booktemp = bookList.get(i);
			System.out.println(booktemp.toString());
			sum += bookList.get(i).getBookcount()
		}
		System.out.println("图书馆拥有图书：" + sum + "本");
	}

	/**
	 * 业务逻辑：登录功能
	 * @param adid
	 * @param adpwd
	 * @return
	 */
	public boolean Admin(String adid, String adpwd) {
		for (int i = 0; i < admList.size(); i++) {
			Admin adtemp = admList.get(i);
			if (adid.equals(adtemp.getAdpwd())) {
				System.out.println("信息正确，进入系统成功！");
				return true;
			} else {
				System.out.println("用户名或者密码错误！");
			}
		}
		return false;
	}

	/**
	 * 根据作者查询图书
	 * @param author
	 * @return
	 */
	public boolean author(String author) {
		for (int i = 0; i < bookList.size(); i++) {
			Book booktemp = bookList.get(i);
			if (booktemp.getAuthor().equals(author)) {
				System.out.println(booktemp.toString());
			}
		}
		return false;
	}
}
