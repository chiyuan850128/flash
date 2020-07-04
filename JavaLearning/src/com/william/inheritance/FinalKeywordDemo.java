package com.william.inheritance;

public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i = 5;
		
		System.out.println(i);
	}
}

final class F {  //cannot extend this class
	final public void show() {  //Cannot be override 
		System.out.println("F class");
	}
}

