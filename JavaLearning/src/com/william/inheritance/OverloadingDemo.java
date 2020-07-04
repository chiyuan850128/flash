package com.william.inheritance;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.show(5);
	}

}

class C {  //Method overloading, early binding, static binding, compile time polymorphism
	public void show() {
		System.out.println("Hello");
	}
	
	public void show(int i) {
		System.out.println("Hello " + i);
	}
}
