package com.william.inheritance;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Abc () {
			public void show() {
				System.out.println("in show");
			}
		};
		obj.show();
	}

}

interface Abc {
	void show();
}

interface yyy {
	
}

interface xyz extends Abc, yyy {
	
}
