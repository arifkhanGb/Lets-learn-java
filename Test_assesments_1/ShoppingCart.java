package Test_assesments_1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
List<Product> cartItems = new ArrayList<>(); 
	
	public void addToCart(Product product) {
		cartItems.add(product);
		
		
	}
	
	public void calculateTotal() {
		
	}
	
	public void displayCart() {
		for(Product p : cartItems) {
			System.out.println(p);
		}
	}
	
	
}
