package OOPFinal;

public class Lineitem {
	private int quantity;
	private Product theProduct;
	
	
	Lineitem(Product theProduct, int quanitity){
		this.theProduct = theProduct;
		this.quantity = quantity;
	}
	
	public String toString() 
	{
		return "theProduct " + theProduct + "quantity " + quantity;
	}
	
	
	// create some get ers
	public Product getProduct() {
		return theProduct;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	// create some setters
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
