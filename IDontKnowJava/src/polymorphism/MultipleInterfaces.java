package polymorphism;

interface interfaceA{
	void interfaceAMethod1();
	void interfaceAMethod2();
}

interface interfaceB extends interfaceA{
	void interfaceBMethod1();
}

//class MyInterface implements interfaceA,interfaceB{
//	@Override
//	public void interfaceBMethod1() {
//	}
//	@Override
//	public void interfaceAMethod1() {
//	}
//	@Override
//	public void interfaceAMethod2() {
//	}
//	
//}

interface interfaceC extends interfaceB{
	void interfaceCMethod1();
}

class MyInterface implements interfaceC{

	@Override
	public void interfaceBMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceAMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceAMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceCMethod1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MultipleInterfaces {

	public static void main(String[] args) {
		

	}

}
