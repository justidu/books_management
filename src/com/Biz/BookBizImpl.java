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
		int sum = 0;
		System.out.println("本图书馆共有" + bookList.size() + "种书");
		for (int i = 0; i < bookList.size(); i++) {
			Book booktemp = bookList.get(i);
			System.out.println(booktemp.toString());
			sum += bookList.get(i).getBookcount();
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

	/**
	 * 根据出版社查询图书
	 * @param publisher
	 * @return
	 */
	public boolean publisher(String publisher) {
		List<Book> booklList = bdi.getAllList();
		for (int i = 0; i < bookList.size(); i++) {
			Book booktemp = bookList.get(i);
			if (publisher.equals(booktemp.getPublisher())) {
				System.out.println(booktemp.toString());
				System.out.println("查询成功！");
			}
		}
		return false;
	}

	/**
	 * 根据书名查找图书
	 * @param bookname
	 * @return
	 */
	public boolean bookname(String bookname) {
		List<Book> booklList = bdi.getAllList();
		for (int i = 0; i < booklList.size(); i++) {
			Book booktemp = booklList.get(i);
			if (booktemp.getBookname().equals(bookname)) {
				System.out.println(booktemp.toString());
			}
		}
		return false;
	}

	/**
	 * 添加图书
	 * @param ISBN
	 * @param bookname
	 * @param author
	 * @param pagenum
	 * @param publisher
	 * @param bookcount
	 * @return
	 */
	public boolean addbook(String ISBN, String bookname, String author, int pagenum, String publisher, int bookcount) {
		Book book = new Book(ISBN, bookname, author, pagenum, publisher, bookcount);
		for (int i = 0; i < bookList.size(); i++) {
			Book booktemp = bookList.get(i);
			if (booktemp.getISBN().equals(ISBN) || booktemp.getBookname().equals(bookname)) {
				System.out.println("该图书已存在！");
				return false;
			}
		}
		bdi.addBook(book);
		System.out.println("添加图书成功！");
		return true;
	}

	/**
	 * 修改图书数量
	 * @param ISBN
	 * @param bookcount
	 * @return
	 */
	public boolean updatecount(String ISBN, int bookcount) {
		for (int i = 0; i < bookList.size(); i++) {
			Book booktemp = bookList.get(i);
			if (booktemp.getISBN().equals(ISBN)) {
				booktemp.setBookcount(bookcount);
				System.out.println("图书数量修改成功！");
			}
		}
		return false;
	}

	/**
	 * 删除图书
	 * @param ISBN
	 * @return
	 */
	public boolean deletebook(String ISBN) {
		for (int i = 0; i < bookList.size(); i++) {
			Book booktemp = bookList.get(i);
			if (booktemp.getISBN().equals(ISBN)) {
				bookList.remove(i);
				System.out.println("图书删除成功！");
			} else {
				System.out.println("没有该图书！");
				return true;
			}
		}
		return false;
	}
	/**
	 * 注册用户
	 * @param adid
	 * @param adpwd
	 */
	public void regist(String adid, String adpwd) {
		Admin admin = new Admin(admList.size() + 1, adid, adpwd);
		adi.insert(admin);
	}
}
