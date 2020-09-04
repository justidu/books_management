package com.Entity;
/**
 * 图书实体类
 * @author songdu
 *
 */
public class Book {
	private String ISBN; //图书编号
	private String bookname;
	private String author;
	private int pagenum; //总页数
	private String publisher; //出版社
	private int bookcount; //图书数量

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookcount() {
		return bookcount;
	}

	public void setBookcount(int bookcount) {
		this.bookcount = bookcount;
	}

	public Book() {
		super();
	}

	public Book(String ISBN, String bookname, String author, int pagenum, String publisher, int bookcount) {
		super();
		this.ISBN = ISBN;
		this.bookname = bookname;
		this.author = author;
		this.pagenum = pagenum;
		this.publisher = publisher;
		this.bookcount = bookcount;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", bookname=" + bookname + ", author=" + author + ", pagenum=" + pagenum
				+ ", publisher=" + publisher + ", bookcount=" + bookcount + "]";
	}
}
