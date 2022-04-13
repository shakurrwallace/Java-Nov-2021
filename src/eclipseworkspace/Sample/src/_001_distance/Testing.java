
package _001_distance;

public class Testing {
	public static void main(String [] args) 
	{
	Sample s, k;	
	
	s = new Sample();
	k = new Sample();
	
	s.x = 10;
	s.y = true;		
	
	k.x = 20;		 
	
	System.out.printf("s.x = %d%n", s.x);
	System.out.printf("s.y = %b%n", s.y);		
	System.out.printf("k.x = %d%n", k.x);
	System.out.printf("k.y = %b%n", k.y);
	System.out.println("-------------------------");		
	
	k = s; //**
			
	System.out.printf("s.x = %d%n", s.x);
	System.out.printf("s.y = %b%n", s.y);		
	System.out.printf("k.x = %d%n", k.x);
	System.out.printf("k.y = %b%n", k.y);		  
	System.out.println("-------------------------");
	
	++s.x; //***
	
	System.out.printf("s.x = %d%n", s.x);
	System.out.printf("s.y = %b%n", s.y);		
	System.out.printf("k.x = %d%n", k.x);
	System.out.printf("k.y = %b%n", k.y);		  
	System.out.println("-------------------------");	
	
	s = new Sample(); //****
	
	s.x = 67;
	
	System.out.printf("s.x = %d%n", s.x);
	System.out.printf("s.y = %b%n", s.y);		
	System.out.printf("k.x = %d%n", k.x);
	System.out.printf("k.y = %b%n", k.y);		  
	System.out.println("-------------------------");	
}
}

class Sample {
public int x;
public boolean y;
//...
}
