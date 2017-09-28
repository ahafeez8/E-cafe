package lab2;

public class Order {
	public static int total;
	public int del_type; //0 = delivered, 1 = self pickup
	public String address;
	
	Order(){total = 0;}
	public void bill(items i)
	{
		total += i.price;
		//System.out.println("Your total bill is:  " + total);
	}
	
}
