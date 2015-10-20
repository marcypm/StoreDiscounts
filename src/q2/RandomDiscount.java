package q2;
import java.util.Random;

public class RandomDiscount implements discount {
	int randDiscount;
	
	public RandomDiscount(float price){
		Random rand = new Random();
		randDiscount = rand.nextInt((int)price);
	}
	
	@Override
	public float setDiscount(float price) {
		System.out.println("Random discount is: $"+ randDiscount);
		return (price - randDiscount);
	}

}
