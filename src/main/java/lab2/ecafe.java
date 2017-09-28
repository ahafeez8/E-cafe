package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class ecafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the E-Cafe");
	
		System.out.println("===========================================================================");
		System.out.println("S#   Name                     Type                      Price ");
		System.out.println("===========================================================================");
		//create items for menu
		items[] i = new items[16];
		i[0] = new items(0, "Curly Fries", "Appetizer", 250);
		i[1] = new items(1, "Nachos    ", "Appetizer", 150);
		i[2] = new items(2, "MacNcheese", "Appetizer", 350);
		i[3] = new items(3, "Garlic Bread", "Appetizer", 100);
		i[4] = new items(4, "Chicken Strips", "Appetizer", 550);
	
		i[5] = new items(5, "Hot & Sour    ", "Soups", 500);
		i[6] = new items(6, "Chicken Soup", "Soups", 450);
		
		i[7] = new items(7, "Rice & Spice", "Main course", 550);
		i[8] = new items(8, "Tarragon Chicken", "Main course", 750);
		i[9] = new items(9, "Morrocon Chicken","Main course", 700);
		i[10] = new items(10,"Quesadillas", "Main course", 550);
		i[11] = new items(11,"Beast Burger Beef","Main course", 800);
		i[12] = new items(12,"Fish Platter", "Main course", 850);
		
		i[13] = new items(13, "Fries              ", "Sides", 50);
		i[14] = new items(14, "Mashed Potato","Sides", 100);
		i[15] = new items(15, "Baked Potato", "Sides", 80);
		//print the menu
		int x = 0;
		while(x < 16)
		{
			i[x++].get_items();
		
		}
		//summarize order and bill
		System.out.println("Select items by specifying item S#");
		Scanner in = new Scanner(System.in);
		
		Order o = new Order();//order created
		o.get_time();
		//take order info
		ArrayList<Integer> picks = new ArrayList<Integer>(); //items picked by S#
		
		int c = 1;
 		int y = 0;
 		
		while(c == 1)
		{			
			picks.add(in.nextInt());//type item number
			System.out.println("1 : continue\n0 : done."); 
			c = in.nextInt();		//check sentinal
		}
	
		while(y < picks.size()) //loop till size of list
		{
			o.bill(i[picks.get(y++)]); //calculate bill
		}
		
		System.out.println("\nYour total bill is:" + o.total); //print total
		System.out.println("Specify your pick up type:\n S: Self, D: Delievered at your address.");
		//select pick up type
		//0 = delivered, 1 = self pickup
		String p_type = in.next();
		if(p_type.equals("S"))
			o.del_type  = 1;
		else if(p_type.equals("D"))
		{
			System.out.println("Please Specify a delivery address:");//if delievered, assign address
			o.del_type = 0;
			o.address = in.next();		
		}
		//Calculate Delivery time		
		
		
	}
	
}
