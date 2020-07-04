package com.william;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


class A2 {
	public void show() {
		System.out.println("in A2");
	}
}

class B2 extends A2 {
	@Override
	public void show() {
		System.out.println("in B2");
	}
}

@interface SmartPhone {
	String os() default "Symbian";
	int version() default 1;
}

@SmartPhone(os="Android", version=6)
class NokiaASeries {
	String model;
	int size;
	
	public NokiaASeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
}

public class Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj = new B2();
		obj.show();
		
		NokiaASeries obj2 = new NokiaASeries("Fire", 5);
		Class c = obj.getClass();
		Annotation an = (Annotation) c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
	}

}
