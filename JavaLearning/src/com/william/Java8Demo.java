package com.william;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		values.forEach(c);
		
		//values.forEach(i -> System.out.println(i));
		//values.forEach(System.out::println);  //call by method
		
		//values.forEach(Java8Demo::doubleit);  //call by method
		
		//Stream<Integer> s = values.stream();
		//Stream<Integer> s1 = s.map((i) -> i*2);
		
		//Integer result = s.map((i) -> i*2).reduce(0, (c,e) -> c+e);
		//System.out.println(values.stream().map((i) -> i*2).reduce(0, (i,j) -> i+j));
		
		Predicate<Integer> p = new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i%2 == 0;
			}
		};
		
		System.out.println(values.stream()
								 //.filter(p)
								 .filter(i -> i%2 == 0)
								 .map(i -> i*2)
								 .reduce(0, (a,b) -> a+b));
	}

	public static void doubleit(int i) {
		System.out.println(i*2);
	}
}

