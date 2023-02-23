package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// &&
		// &
		
		int a=10;
		int b=15;
		int c=20;
//		System.out.println((a<b)&&(a>c));
//		System.out.println((a<b)&(a>c));
		
		//System.out.println((a>b)&(++a>c));
		//System.out.println((a>b)&&(++a>c));
		
		// && - short circuit AND operator
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		// || - short circuit OR operator
		
		//System.out.println((a<b)|(++a>c));
		System.out.println((a<b)||(++a>c));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		

	}

}
