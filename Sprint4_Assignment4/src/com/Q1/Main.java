package com.Q1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> productL = new ArrayList<>();
		
		while(true) {
			
			System.out.println("Enter the Product details:\n");
			
			System.out.println("Enter Product Id:");
			int productId = sc.nextInt();
			
			System.out.println("Enter Product Name:");
			String productName = sc.next();
			
			System.out.println("Enter Product Price:");
			double productPrice = sc.nextDouble();
			
			
			productL.add(new Product(productId, productName, productPrice));
		
			
			if(productL.size()==4) {
				break;
			}
			
			
		}
		
		System.out.println("Enter the choice :\r\n"
				+ " 1 for sorting the product according to the productPrice\r\n"
				+ " 2 for sorting the product according to the productName\r\n"
				+ " 3 for sorting the product according to the productId\r\n"
				+ "");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Sort By Price:");
			
			
			CompByPrice cp = new CompByPrice();
			Set<Product> productList1 = new TreeSet<>(cp); 
			productList1.addAll(productL);
			
			System.out.println(productList1);
	

			
		}
		
		else if(choice == 2) {
			System.out.println("Sort By Name:");

			CompByName cn = new CompByName();
			Set<Product> productList2 = new TreeSet<>(cn); 
			productList2.addAll(productL);
			
			System.out.println(productList2);

			
		}
		else {
			System.out.println("Sort By Id:");
			
			CompById ci = new CompById();
			Set<Product> productList3 = new TreeSet<>(ci); 
			productList3.addAll(productL);
			
			System.out.println(productList3);

			
		}
		
		
	}

}















