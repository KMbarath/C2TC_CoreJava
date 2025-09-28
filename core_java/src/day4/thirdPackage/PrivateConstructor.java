package day4.thirdPackage;

public class PrivateConstructor {
	public static void main(String s[]) {
		MyClass m=MyClass.getObject();
		m.setId(4);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}

}
