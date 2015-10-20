package q2;

public class Demo {

	
	public static void main(String [] args){
		
		Order customerOrder = new Order("16/10/2015", "Rawad", (float)200.00); // change date, name, or price of item
		
		discount perDisc = new PercentDiscount(15); //percent of discount
		discount credDisc = new CreditDiscount(30); //credits discounted
		discount randDisc = new RandomDiscount(customerOrder.getPrice()); //random discount
		
		//uncomment one of the three lines bellow corresponding to the discount you wish to give
		
		//customerOrder.setDiscountPrice(perDisc.setDiscount(customerOrder.getPrice()));
		//customerOrder.setDiscountPrice(credDisc.setDiscount(customerOrder.getPrice()));
		customerOrder.setDiscountPrice(randDisc.setDiscount(customerOrder.getPrice()));
		
		customerOrder.toString();
		
	}
	
}
