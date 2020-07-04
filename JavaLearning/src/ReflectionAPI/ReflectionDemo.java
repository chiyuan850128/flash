package ReflectionAPI;

import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c = Class.forName("ReflectionAPI.Test");
		Test t = (Test)c.newInstance();
		Method m = c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
	}

}
