package com.william.staticDemo;

public class StaticBlock {

	static String s = "";
	//static block
	static {
		s = "Hello world";
		System.out.println("Hello World in static1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
	}
	
	//static block
	static {
		System.out.println("Hello World in static2");
	}

}
