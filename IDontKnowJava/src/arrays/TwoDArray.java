package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		//int[][]num=new int[3][5];
		
		int[][]num= {
				{10,20,30,40,50},
				{60,30,50,10,20},
				{80,30,50,10,60}
			};
		
		//System.out.println(num.length);
		//System.out.println(num[0].length);
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
