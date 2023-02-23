package collections;

class GenericClass<T>{
	
	public void display(T a,T b) {
		System.out.println(a+" "+b);
	}
}

interface GenericInterface<T>{
	void method(T a);
}

class Test implements GenericInterface<Integer>{
	@Override
	public void method(Integer a) {
		
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		GenericClass<Integer> gc=new GenericClass<>();
		GenericClass<String> gcString=new GenericClass<>();
	}
}
