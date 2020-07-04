package com.william;

/*
interface MobileCompany {
	static String APPLE = "Apple";
	static String SAMSUNG = "Samsung"; 
}
*/

public class EnumExample {

	enum Mobile {
		APPLE(100), SAMSUNG, HTC(90);
		
		int price;
		
		Mobile() {
			price = 80;
			System.out.println("Constructor");
		}
		
		Mobile(int p) {
			price = p;
		}
		
		public int getPrice() {
			return price;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Mobile.APPLE);
		/*
		Mobile m = Mobile.APPLE;
		switch(m) {
			case APPLE:
				System.out.println("Apple");
				break;
			case SAMSUNG:
				System.out.println("Samsung");
				break;
			case HTC:
				System.out.println("HTC");
				break;
		}
		*/
		System.out.println(Mobile.APPLE.getPrice());
		
		Mobile[] m = Mobile.values();
	}

}
