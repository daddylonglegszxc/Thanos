package OOPFinal;
import java.util.ArrayList;
import java.util.Arrays;

public class Invoice {
	
	private Customer theCustomer = new Customer(null, null, 0);
	private ArrayList<Lineitem> items = new ArrayList<Lineitem>();
	
	public Invoice(Customer theCustomer)
	{
		
	}
	
	public void addToOrder(Product newproduct, int price)
	{
		Lineitem theproduct = new Lineitem(newproduct, price);
		items.add(theproduct);
	}
	
	public void printInvoice()
	{
		for(int i = 0; i < items.size(); i ++)
		{
			System.out.println(items.get(i));
		}
	}
	
	
	public double amountDue() 
	{
		int totalprice = 0;
		for(int i = 0; i < items.size(); i ++ )
		{
			// check product and price for the product
			totalprice += items.get(i);
		}
		return totalprice;
	}
	
	public boolean canAfford(Customer theCustomer)
	{
		if(theCustomer.evilFunds )
		{
			
		}
			
	}
	
	public boolean canAfford()
	{
		if(theCustomer.evilFunds )
		{
			
		}
			
	}
	
	///////////////
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
