package polymorphism;

public abstract class Amazon {

	private double amazonDiscount;
	//static int test;
	
	public Amazon() {
		amazonDiscount=0.02;
	}
	public double getAmazonDiscount() {
		return amazonDiscount;
	}
	abstract void sellProduct(double price);
}
class AmazonSeller1 extends Amazon{
	private double sellerDiscount;
	public AmazonSeller1(double sellerDiscount) {
		this.sellerDiscount=sellerDiscount;
	}
	@Override
	void sellProduct(double price) {
		double amount=price-(price*super.getAmazonDiscount()+sellerDiscount);
		System.out.println("Amount to pay to Seller1: "+amount);
	}
}

class AmazonSeller2 extends Amazon{
	private double sellerDiscount;
	private double primeDiscount;
	
	public AmazonSeller2(double sellerDiscount,double primeDiscount) {
		this.sellerDiscount=sellerDiscount;
		this.primeDiscount=primeDiscount;
	}
	@Override
	void sellProduct(double price) {
		double amount=price-(price*super.getAmazonDiscount()+sellerDiscount+primeDiscount);
		System.out.println("Amount to pay to Seller2: "+amount);
	}
	
}


