package lab2;

public class Order {
	public static int total;
	public int del_type; //0 = delivered, 1 = self pickup
	public String address;
	public long punch_time;
	Order(){total = 0;
	punch_time = System.currentTimeMillis();
	}
	public void bill(items i)
	{
		total += i.price;
		//System.out.println("Your total bill is:  " + total);
	}
	public void get_time()
	{
		System.out.println("Order punched at: " +punch_time) ;
	}
}
