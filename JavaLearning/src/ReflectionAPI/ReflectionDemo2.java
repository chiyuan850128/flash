package ReflectionAPI;

class A {
	
}

public class ReflectionDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c = Class.forName("ReflectionAPI.A");
		System.out.println(c.isInterface());
	}

}
