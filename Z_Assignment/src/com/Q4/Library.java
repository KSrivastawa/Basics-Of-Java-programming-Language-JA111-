package com.Q4;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	
	void addBook(Book book) {
		System.out.println("Book added successfully\n");
		this.bookList.add(book);
	}
	
	boolean isEmpty() {
		return false;
					
	}
	
	List<Book> viewAllBooks(){
		
		int count = 1;
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(count++ +" Book Details:\n------------");
				
			System.out.println("ISBN No: "+bookList.get(i).getIsbn());
			System.out.println("Book Name: "+bookList.get(i).getBookName());
			System.out.println("Author Name: "+bookList.get(i).getAuthor());
			System.out.println("/--------------------/");
				
		}
		return this.bookList;
		
	}
	
	List<Book> viewBooksByAuthor(String author ){
		List<Book> bookListByAuthor=new ArrayList<>();
		
		if(author != null) {
//			for(int i=0; i<bookList.size(); i++) {
//					 if(bookList.get(i).getAuthor().equals(author)) {
//						 bookListByAuthor.add(bookList.get(i));
//					 }
//			}
			
			for(Book b : bookList) {
				if(b.getAuthor().equals(author)) {
					bookListByAuthor.add(b);
				}
			}
			return bookListByAuthor;
		}
		
		return bookList;
	
	}

	
	int countNoOfBook(String bookName) {
		int count = 0;
		
		for(Book b : bookList) {
			if(b.getBookName().equals(bookName)) {
				count++;
			}
		}
		
		return count;
		
	}
	
}










