package com.tnsif.daytwoprograms;

public class EncapsulationMain {
	public static void main(String[] args) {
		// Creating object
		EncapsulationLogic obj = new EncapsulationLogic();
		obj.Introduction();
		
		obj.setprivateVariable(333);{
		System.out.println("The number is set to 333");
		}
		System.out.println(obj.getprivateVariable());
	}

}
