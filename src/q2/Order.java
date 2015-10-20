package q2;

public class Order {
	float itemPrice;
	float itemDiscountPrice;
	String customerName;
	String dateOfToday;
	
	
	public Order(String d, String name, float price){
		itemPrice = price;
		itemDiscountPrice = price;
		customerName  =name;
		dateOfToday = d;
	}
	
	
	public float getPrice(){
		return itemPrice;
	}
	
	public void setDiscountPrice(float d){
		itemDiscountPrice = d;
		
	}
	
	public String toString(){
		System.out.println("Original item price: $"+itemPrice+" \nDiscount Price: $"+itemDiscountPrice);
		return "";
	}
	
	
}
