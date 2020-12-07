package oct16;

class MyClass{
	private static MyClass ref;
	private MyClass() {
		
	}
	public static MyClass getInstance() {
		if(ref==null) {
			ref = new MyClass();
		}
		return ref;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		MyClass m = MyClass.getInstance();
		System.out.println(m); 
		MyClass m1 = MyClass.getInstance();
		System.out.println(m1);
		MyClass m2 = MyClass.getInstance();
		System.out.println(m2);
	}

}
