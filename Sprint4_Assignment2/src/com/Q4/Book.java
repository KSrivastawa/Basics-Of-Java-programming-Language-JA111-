package com.Q4;

public class Book {


	private int isbn;
	private String bookName;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int isbn, String bookName, String author) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
	}

	
	public final int getIsbn() {
		return isbn;
	}

	public final void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public final String getBookName() {
		return bookName;
	}

	public final void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public final String getAuthor() {
		return author;
	}

	public final void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}
