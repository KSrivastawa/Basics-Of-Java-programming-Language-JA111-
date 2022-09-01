package com.Q4;

import java.util.Objects;

public class Product {

	String name;
	double price;
	String company;
	int count;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}


	@Override
	public int hashCode() {
		return Objects.hash(company, name, price);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(company, other.company) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}




	@Override
	public String toString() {
		return "Product {name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "}";
	}

	
	
}
