package java8;

//from java8 we can have method with body by adding Default Method

interface MyInterface{
	
	//need an object to access
	 default void method() {
		System.out.println("Default MyInterface Method");
	}	
}
interface MyInterface1{
	
	//need an object to access
	 default void method() {
		System.out.println("Default MyInterface1 Method");
	}	
}

//class cannot have two parents that contains the same method
//to resolve this issue we have to write our own method

interface TestInterface {
	void method1();
	void method2();
	void method3();
	default void method4() {}
	default void method5() {}
	
}

class Class1 implements TestInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
}
class Sample implements MyInterface,MyInterface1{
	public void method() {
		MyInterface.super.method();
//		MyInterface1.super.method();
		System.out.println("Child class method");
	}
}

public class Interfaces {
	public static void main(String[] args) {
		MyInterface interface1 = new Sample();
		interface1.method();
	}
}
