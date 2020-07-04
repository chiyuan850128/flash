package com.william;

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B obj = a.new B();
		obj.show();
		
		A.C obj2 = new A.C();
		obj2.show();
		
		D obj3 = new D() {
			public void show() {
				System.out.println("Hi");
			}
		};
		obj3.show();
		
		E obj4 = () -> System.out.println("Hi");
		obj4.show();
	}

}

class A {
	int rollno;
	String sname;
	
	class B {
		public void show() {
			System.out.println("Hello");
		}
	}
	
	static class C {
		public void show() {
			System.out.println("Hello");
		}
	}
}

class D {
	public void show() {
		System.out.println("Hello");
	}
}

@FunctionalInterface
interface E {
	void show();
}
