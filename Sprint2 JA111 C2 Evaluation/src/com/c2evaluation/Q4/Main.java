package com.c2evaluation.Q4;

import java.util.Scanner;

public class Main{

	
		public static Laptop getLaptop(String laptopPurpose){
			
		Laptop laptop = new Laptop();
			
			if(laptopPurpose.equals("gaming")) {
				
				laptop.setColor("Black");
				laptop.setCompanyName("xyz");
				laptop.setName("a");
				laptop.setPurpose(laptopPurpose);
				
				CPU cpu = new CPU();
				cpu.setManufacturer("a");
				cpu.setProcessor("d");
				cpu.setClockSpeed(4546.0);
				
				GraphicCard graphicCard = new GraphicCard();
				graphicCard.setManufacturer("hjjfj");
				graphicCard.setCapacity("hg");
				graphicCard.setSeries("shdgf");
				
				laptop.setCpu(cpu);
				laptop.setGraphicCard(graphicCard);
				return laptop;
			}
			
			else if(laptopPurpose.equals("business")) {
				
				laptop.setColor("White");
				laptop.setCompanyName("abc");
				laptop.setName("x");
				laptop.setPurpose(laptopPurpose);
				
				CPU cpu = new CPU();
				cpu.setManufacturer("a");
				cpu.setProcessor("d");
				cpu.setClockSpeed(4546.0);
				
				GraphicCard graphicCard = new GraphicCard();
				graphicCard.setManufacturer("hjjfj");
				graphicCard.setCapacity("hg");
				graphicCard.setSeries("shdgf");
				
				laptop.setCpu(cpu);
				laptop.setGraphicCard(graphicCard);
				return laptop;
			}
			else {
				return null;
			}
			
		}
		public static void main(String[] args) {
		// TODO Auto-generated constructor stub
			String purpose, purpose1;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Laptop Purpose(gaming/business): ");
			purpose = sc.next();
			
			Laptop gamingLaptop=getLaptop(purpose);
			gamingLaptop.displayDetails();
			
			System.out.println("Enter Laptop Purpose(gaming/business): ");
			purpose1 = sc.next();
			
			Laptop bussinessLaptop=getLaptop(purpose1);
			bussinessLaptop.displayDetails();
			

		}
		

}






