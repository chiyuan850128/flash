package com.william.inheritance;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new E();   //Dynamic method dispatch
		obj.show();
	}

}

class D {  //Method overriding, late binding, dynamic binding, runtime polymorphism
	public void show() {
		System.out.println("In show D");
	}
}

class E extends D {
	public void show() {
		System.out.println("In show E");
	}
}