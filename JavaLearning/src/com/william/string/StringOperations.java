package com.william.string;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		String s3 = s1.concat(s2);
		System.out.println("Result on Concatenation is : " + s3);
	}

}
