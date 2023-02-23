package operators;

public class UnaryBinaryOperator {

	public static void main(String[] args) {
		
		int num=10;
		//System.out.println(num++);
		//System.out.println(num--);
		//System.out.println(++num);
		//System.out.println(--num);
		
		//int res=--num+num---num+--num;
		      //  9  + 9   -8  + 7
		int res=num+++-num++-num--; //-11,-12,-13
		      //    10 +(-11) -(12)
		System.out.println(res);  
		System.out.println(num);
	}

}
