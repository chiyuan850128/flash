package com.william.inheritance;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G obj = new G(6);
		obj.show();
	}

}

class G {
	private int x;  //Instance
	
	public G(int x) {  //local
		this.x = x;    //Current instance
	}
	
	final public void show() {
		System.out.println("x is " + x);
	}
}
