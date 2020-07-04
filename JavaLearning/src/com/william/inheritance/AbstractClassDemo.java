package com.william.inheritance;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaheshPhone obj = new SureshPhone();  //cannot instantiate the abstract class
		obj.call();
		obj.cook();
		obj.dance();
		obj.cook();
		
		Iphone obj1 = new Iphone();
		SamsungS4 obj2 = new SamsungS4();
		show(obj1);
		show(obj2);
	}
	
	public static void show(Phone obj) {
		obj.showConfig();
	}
}

abstract class Phone {
	public abstract void showConfig();
}

class Iphone extends Phone{
	public void showConfig() {
		System.out.println("2 Gb, IOS 9.3");
	}
}

class SamsungS4 extends Phone{
	public void showConfig() {
		System.out.println("2 Gb, Lolipop");
	}
}

abstract class MaheshPhone {
	public void call() {
		System.out.println("calling...");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone {
	public void move() {
		System.out.println("moving...");
	}
}

class SureshPhone extends RameshPhone {
	public void dance() {
		System.out.println("dancing...");
	}
	public void cook() {
		System.out.println("cooking...");
	}
}
