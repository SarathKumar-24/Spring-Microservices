package java8;


interface ShapeTwo<T>{
	T area(T x,T y);
	
}

public class LambdaExpressions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeTwo<Integer> rec = (a,b)->a*b;
		System.out.println("Area of the Rectangle: "+rec.area(12, 14));
		ShapeTwo<Float> Tri = (a,b)->{
			float ans = ((0.5f)*a*b);
			return ans;
		};
		System.out.println("Area of the Triangle: "+Tri.area(4.5f, 6.6f));
		
		ShapeTwo<Double> parallelogram = (b,h)->b*h;
		System.out.println("Area of the Parallelogram: "+parallelogram.area(43.5, 67.9));
	}

}
