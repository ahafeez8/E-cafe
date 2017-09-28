package lab2;

public class items {
	public int s_num;
	public String name;
	public String type;
	public int price;
	
	items(int s, String n, String t, int p){
		s_num = s;
		name = n;
		type = t;
		price = p;
	}
	public void get_items()
	{
		System.out.println(s_num + "   " + name +"                "+type+"                "+price);
	}
	

}
