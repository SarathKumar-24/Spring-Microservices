package java8;
//30/1/2023

//interface must have only one abstract method (SAM Interface) or Functional Interface for Lambda method
/*interface Calculator{
	int add(int a,int b);
}*/


/*interface Calculator<T>{
	T add(T a,T b);
}*/


@FunctionalInterface
interface Calculator<T>{
	T add(T a,T b);
	//T sub(T a, T b);
	
//	methods that can be allowed inside the functional Interface
	default void method1(){}
	private void method2() {}
	static void method3() {}
	int hashCode();
	String toString();
	boolean equals(Object obj);// we can have a object class method inside a functional interface

// First way


	/*
	 * class CalculatorImpl implements Calculator{
	 * 
	 * @Override public int add(int a, int b) { // TODO Auto-generated method stub
	 * int sum=a+b; return sum; }
	 */
	
}


public class FunctionalInterfaces {
	public static void main(String[] args) {

		
	/*  Calculator calc = new CalculatorImpl();
		int result = calc.add(43, 32);
		System.out.println("sum = "+result);
		*/
//---------------anonymous class --> Lambda Function--------------------
		
		
// ----> SECOND WAY
		
/*		Each object can have different Override Methods 
		Anonymous object  will follow Singleton method
		example :  OTP*/
		
/*		Calculator calc = new Calculator() {
			
			@Override
			public int add(int a, int b) {
	
				// TODO Auto-generated method stub
				return 0;
			}
		};
		

		Calculator calc1 = new Calculator() {
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				int sum=a+b;
				return sum;
			}
		};
		
		System.out.println(calc1.add(43, 23));
*/
//  Third Way
		
/*  Overriding an interface method or Functional interface with 
	anonymous class and anonymous method: Lambda Expression
	Lambda Expression: (parameter - list) -> (Method-body)
	curly braces are required only if method body has more than one line of code or have a written keyword used.
 	it should end with semi column*/
		
/*		Calculator calc4 = (int a, int b)->{
			int sum=a+b;
			return sum;
		};
		
		*/
		
//		Calculator calc4 = (int a, int b) ->{ return a+b; };
		
		Calculator<Integer> calc4 = (a,b)-> a+b;// we don't have to use return statement for single line method
		
		Calculator<Integer> calc1 = (a,b)-> 15;
		System.out.println(calc1.add(234, 34));
		
 		int res=calc4.add(23, 32);
		System.out.println(res);
		
		Calculator<Double> calc5 = (x,y)->x+y;
		System.out.println(calc5.add(234.23, 23.34));

		
		

	}
}
