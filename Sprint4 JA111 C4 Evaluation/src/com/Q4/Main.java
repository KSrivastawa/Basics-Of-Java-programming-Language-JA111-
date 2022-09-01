package com.Q4;

public class Main {

	public static void main(String[] args) {
		
		Ecommerce ecommerce=new Ecommerce();
		
		ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",12));
		ecommerce.addProductToList(new Product("Ipad",100000,"Apple",2));
		ecommerce.addProductToList(new Product("Ipad",100000,"Apple",4));
		ecommerce.addProductToList(new Product("Shoes",4000,"Nike",4));
		ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",8));
		
		System.out.println(ecommerce.showAllProduct());


	}

}
