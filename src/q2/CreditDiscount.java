package q2;

public class CreditDiscount implements discount {
	float credits;
	
	public CreditDiscount(float c){
		credits = c;
	}
	
	@Override
	public float setDiscount(float price) {
		// TODO Auto-generated method stub
		System.out.println("Credits given: "+credits);
		if(credits > price)
			return 0;
		return price - credits;
	}
	
}
