package kail.study.java.solid;

public class DiscountedBag extends Bag{
	private double discountRate;

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void applyDiscount(int price) {
		super.setPrice(price- (int)(discountRate * price));
	}
}
