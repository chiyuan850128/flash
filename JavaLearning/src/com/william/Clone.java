package com.william;


public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Abc obj = new Abc();
		obj.i = 5;
		obj.j = 6;
		
		Abc obj1 = (Abc)obj.clone();
		obj1.j = 8;
		System.out.println(obj);
		System.out.println(obj1);
	}

}

class Abc implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}