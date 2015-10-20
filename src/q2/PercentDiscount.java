package q2;

public class PercentDiscount implements discount{
	int percent;
	
	public PercentDiscount(int p){
		percent = p;
		
	}
	
	@Override
	public float setDiscount(float price) {
		System.out.println("Discount of "+percent+"% given");
		if(((float)percent/100)*price > price)
			return 0;
		return (price-((float)percent/100)*price);
	}
	
}
