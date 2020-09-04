package com.Test;

/**
 * UI界面
 * @author songdu
 *
 */

import java.util.Scanner;

import com.Biz.BookBizImpl;
import com.Entity.Admin;

public class BookMenu {
	Scanner input = new Scanner(System.in);
	BookBizImpl bookimpl = new BookBizImpl();
	Admin admtemp = null;

	public BookMenu() {
		bookimpl.bdi.init();
		bookimpl.adi.init();
	}

	/**
	 * 登录菜单方法
	 */
	public void showmenu() {
		while (true) {
			System.out.println("------欢迎使用图书管理系统--------");
			System.out.println("-----------------------------");
			System.out.println("1、登录");
			System.out.println("2、注册");
			System.out.println("3、退出");
			int search = input.nextInt();

			switch (search) {
			case 1://登录
				System.out.println("请输入管理员账户和密码：");
				System.out.println("请输入用户名：");
				String adid = input.next();
				System.out.println("请输入密码：");
				String adpwd = input.next();
				boolean isloginsuceess = bookimpl.Admin(adid, adpwd);
				if (isloginsuceess == true) {
					showLoginMenu();
				}
				continue;
			case 2://注册
				System.out.println("注册");
				System.out.println("请输入用户名：");
				String username1 = input.next();
				System.out.println("请输入密码：");
				String password1 = input.next();
				bookimpl.regist(username1, password1);
				continue;
			case 3://退出
				System.out.println("-----欢迎下次使用！------");
				System.exit(1);
				continue;
			default:
				showmenu();
				break;
			}
		}
	}

	public void showLoginMenu() {
		while (true) {
			System.out.println("------欢迎使用图书管理系统--------");
			System.out.println("-----------------------------");
			System.out.println("1.查询所有图书");
			System.out.println("2.根据作者查询图书");
			System.out.println("3.根据出版社查询图书");
			System.out.println("4.根据书名查询图书");
			System.out.println("5.新增图书");
			System.out.println("6.修改图书数量");
			System.out.println("7.删除图书");
			System.out.println("8.返回上一级菜单");
			System.out.println("-----------------------------");
			System.out.println("请选择您的服务项目(1-8):");
			int select = input.nextInt();
			switch (select) {
			case 1://显示所有图书
				ShowAllBook();
				break;
			case 2://根据作者查询图书
				selectAuthor();
				break;
			case 3://根据出版社查询图书
				selectPublisher();
				break;
			case 4://根据书名查找图书
				selectBookName();
				break;
			case 5://增加图书
				insertBook();
				break;
			case 6://修改图书数量
				UpdateBookCount();
				break;
			case 7://删除图书
				delete();
				break;
			case 8://返回系统界面
				System.out.println("感谢您的使用，下次再见！");
				showmenu();
				break;
			default:
				showLoginMenu();
				break;
			}
		}

	}

	//显示所有图书的方法
	public void ShowAllBook() {
		bookimpl.showAllBook();
	}

	//根据作者查询图书
	public void selectAuthor() {
		System.out.println("请输入作者姓名：");
		String author = input.next();
		bookimpl.author(author);
	}

	//根据根据出版社查询图书
	public void selectPublisher() {
		System.out.println("请输入出版社名称：");
		String publisher = input.next();
		bookimpl.publisher(publisher);
	}

	//根据书名查询图书
	public void selectBookName() {
		System.out.println("请输入查找的书名：");
		String bookname = input.next();
		bookimpl.bookname(bookname);
	}

	//新增图书
	public void insertBook() {
		System.out.println("新增图书：");
		System.out.println("请输入新增图书编号");
		String isbn = input.next();
		System.out.println("请输入新增图书名称");
		String name = input.next();
		System.out.println("请输入新增图书作者");
		String author1 = input.next();
		System.out.println("请输入新增图书页数");
		int pag = input.nextInt();
		System.out.println("请输入新增图书出版社");
		String pub = input.next();
		System.out.println("请输入新增图书数量");
		int count = input.nextInt();
		bookimpl.addbook(isbn, name, author1, pag, pub, count);
	}

	//修改图书数量
	public void UpdateBookCount() {
		System.out.println("请输入要修改的图书编号：");
		String ISBN = input.next();
		System.out.println("请输入要修改的图书数量：");
		int bookcount = input.nextInt();
		bookimpl.updatecount(ISBN, bookcount);
	}

	//删除图书
	public void delete() {
		System.out.println("准备删除书");
		System.out.println("请输入要删除的图书编号：");
		String is = input.next();
		bookimpl.deletebook(is);
	}
}
