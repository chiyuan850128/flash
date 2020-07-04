package com.william.inheritance;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(5);  //Always call super() without paras
		B obj2 = new B();
		obj2.show();
	}

}

class A {
	int i = 5;
	public A() {
		System.out.println("In Const A");
	}
	public A (int i) {
		System.out.println("In Const A Para");
	}
	
	public void show() {
		System.out.println("A class");
	}
}

class B extends A {
	int i = 4;
	public B() {
		System.out.println("In Const B");
	}
	public B (int i) {
		System.out.println("In Const B Para");
	}
	
	public void show() {
		super.show();
		System.out.println(super.i);
	}
}