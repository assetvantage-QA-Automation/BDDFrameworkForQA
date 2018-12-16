package Demo_Framework.execution;

class A{
	int a=0;
	A() {
		System.out.println("I'm from A");
	}
	 A(int a) {
		 this.a=a;
		System.out.println("from constructor A int a");
		
	}
	A t2() {
		System.out.println("from t2");
		return t2();
	}
}

public class AppTest {
	
	public static void main(String[] args) {
//		A a =new A();
//		a.t2();
//		a.t2();
	System.out.println(System.getProperty("user.dir"));
	}
}

