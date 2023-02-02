class simple
{
	public int a = 20;
	long b = 1234567890;
	short c = 10;
	public int x = 20;
	
	
    int display() 
        {
		System.out.println("THIS MESSAGE FROM DISPLAY METHOD  !! \n"+ "value of a is : " + a);
		System.out.println("VALUE OF LONG IS :" + b);
		return 0;
		}
}
public class demo extends simple
{
	//int d = a + c;
	
	
	int display() 
	{
		int d = a + x;
		System.out.println(d);
		return 0;
	}

	public static void main(String args[]) {
		//demo d = new demo();
		demo s = new demo();
		simple d = new simple();
		d.display();
		s.display();
		
	
	
}
}