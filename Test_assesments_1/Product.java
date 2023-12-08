package Test_assesments_1;

public class Product {
	private String productName;
	private double price;
	
	public void setProductDetails(String p_name, double price) {
		this.productName = p_name;
		this.price = price;
		
	}
	
	public void getProductDetails() {
		System.out.println("product Name = " + productName);
		System.out.println("price of product = " + price);
	}

}
