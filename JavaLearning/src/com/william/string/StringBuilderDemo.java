package com.william.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("William");  //thread safe
		sb.append(" Ding");
		sb.replace(0, 5, "Andre");
		sb.delete(8, 10);
		System.out.println(sb);
	}

}
