package arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		//int[] arr=[3][4][5];
		int[][][]arr= {
				{
					{10,20,30,40,50},
					{10,40,50,23,45},
					{40,50,60,70,80},
					{30,67,40,67,20}
				},
				{
					{10,20,30,40,50},
					{10,40,50,23,45},
					{40,50,60,70,80},
					{30,67,40,67,20}
				},
				{
					{10,20,30,40,50},
					{10,40,50,23,45},
					{40,50,60,70,80},
					{30,67,40,67,20}
				},
		};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][0].length);
		System.out.println(arr[0][0][0]);
	}

}
