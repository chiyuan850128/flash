package com.william.wrapper;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		Integer ii = new Integer(i);  //Boxing
		Integer jj = i;  			  //AutoBoxing
		
		int j = jj.intValue();        //Unboxing
		int k = jj;					  //AutoUnboxing
		
		ArrayList<Integer> values = new ArrayList();
		values.add(5);				  //AutoBoxing
		values.add(7);				  //AutoBoxing
	}

}
