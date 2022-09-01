package com.Q4;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Library library = new Library();
		
		int count = 1;
		
		while(true) {
			
			System.out.println("Sample Input "+count++ +":");
			
			System.out.println("1.Add Book\r\n"
					+ "2.Display all book details\r\n"
					+ "3.Search Book by author\r\n"
					+ "4.Count number of books - by book name\r\n"
					+ "5.Exit\r\n"
					+ "");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the isbn no:");
				int isbn = sc.nextInt();
				
				System.out.println("Enter the book name:");
				String bookName = sc.next();
				
				System.out.println("Enter the author name:");
				String authorName= sc.next();
				
				library.addBook(new Book(isbn, bookName, authorName));
				
			}
			
			else if(choice == 2) {
				library.viewAllBooks();
			}
			
			else if(choice == 3) {
				System.out.println("Enter the author name:");
				String searchByAuthor= sc.next();
			
				library.viewBooksByAuthor(searchByAuthor);
				
				for(int i=0; i<library.bookList.size(); i++) {
					if(library.bookList.get(i).getAuthor()== searchByAuthor) {
						System.out.println("ISBN no: "+library.bookList.get(i).getIsbn());
						System.out.println("Book Name: "+library.bookList.get(i).getBookName());
						System.out.println("Author Name: "+library.bookList.get(i).getAuthor());
						System.out.println("---------------------------");
					}
				}
				
			}
			
			else if(choice == 4) {
				int counts = 0;
				for(int i=0; i<library.bookList.size(); i++) {
					library.countNoOfBook(library.bookList.get(i).getBookName());
					count++;
				}
				System.out.println(counts);
			}
			
			else if(choice == 5) {
				System.out.println("Thank You !!");
				break;
			}
		
			
		}
	

	}


}








