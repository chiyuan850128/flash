package com.william.inter;

public interface Actor {
	void act();
	void speak();
	default void comedy() {
		System.out.println("I can make ppl laugh");
	}
}
