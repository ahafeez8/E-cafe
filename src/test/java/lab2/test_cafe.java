package lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_cafe {

	@Test
	public void testBill() {
		items i = new items(15, "Baked Potato", "Sides", 80);
		items i1 = new items(14, "Mashed Potato","Sides", 100);
		Order o = new Order();
		o.bill(i);
		assertEquals(o.total, 180); //calculates bill order
	}
	@Test
	public void ordertimeTime() {
		Order o = new Order();
		assertNotEquals(o.punch_time, System.currentTimeMillis());//specifies older order
	}
	@Test
	public void cookbusyTest() {
		cooks c = new cooks();
		assertEquals(c.busy, 0);
	}
	
	@Test
	public void delType() {
		Order[] o = new Order[2];
		o[0].del_type = 1; 
		o[1].del_type = 2;
		assertEquals(o[1], 0);
	}
	
}
