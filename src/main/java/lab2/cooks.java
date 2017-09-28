package lab2;

public class cooks {
	public int busy;//1 for busy, 0 for not busy
	public long start_cooking; 
	cooks()
	{
		busy = 0; //cook to not busy
		start_cooking = System.currentTimeMillis();//punch time 
	}	
	
}
