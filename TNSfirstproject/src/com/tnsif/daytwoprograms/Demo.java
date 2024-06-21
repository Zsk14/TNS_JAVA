package com.tnsif.daytwoprograms;

import java.util.Scanner;

//Program to demonstrate scanner class

public class Demo {
	 
	private String name,city;
	private int id;
	
	public static void main(String[] args) {
	    //TODO Auto - generated method stud
		Demo de = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		de.id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name");
		de.name=sc.nextLine();
		System.out.println("Enter the City");
		de.city=sc.nextLine();
		System.out.println(de);
		
}

	@Override
	public String toString() {
		return "Demo [Name =" + name + ", City =" + city + ", id =" + id + "]";
	}
}
