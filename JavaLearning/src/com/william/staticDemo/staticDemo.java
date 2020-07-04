package com.william.staticDemo;

public class staticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc.show();
		Abc obj = new Abc();
		obj.show2();
	}
}

class Abc {
	static int i = 5;
	public static void show() {
		System.out.println("static Hi " + i);
	}
	
	public void show2() {
		System.out.println("non static Hi " + i);
	}
}
