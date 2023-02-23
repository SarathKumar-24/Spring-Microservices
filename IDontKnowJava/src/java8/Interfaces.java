package java8;

interface MyInterface{
	default void method() {
		System.out.println("MyInterface default method.");
	}
}

interface MyInterface1{
	default void method() {
		System.out.println("MyInterface1 default method.");
	}
}

interface TestInterface{
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
		MyInterface1.super.method();
		System.out.println("Child class method.");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.method();
		
		
		

	}

}
