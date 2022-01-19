package _008_Homework1;
class App {
	public static void main (String [] args)
	{
		NumberUtil.run();
	}
}
class NumberUtil {
	public static void run () {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		System.out.println("1. sayıyı giriniz: ");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.println("2. sayıyı giriniz: ");
		int b = Integer.parseInt(kb.nextLine());
		
		System.out.println("3. sayıyı giriniz: ");
		int c = Integer.parseInt(kb.nextLine());

		int mid = mid(a, b, c);
		int max = max(a, b, c);
		int min = min(a, b, c);
		display(min, mid, max);
	}
	
	public static int mid(int a, int b, int c)
	{
		if (a >= b && a <= c || a >= c && a <= b) {
			return a; 
		} else if (b >= a && b <= c || b >= c  && b <= a) {
			return b; 
		} 
		return c; 			
	}

	public static int max(int a, int b, int c) 
	{
		return Math.max(Math.max(a, b), c);
	}
	
	public static int min(int a, int b, int c)
	{ 
		return Math.min(Math.min(a, b), c);
	}
	
	public static void display(int min,int mid,int max)
	{
		System.out.printf("%d %c %d %c %d ", min, relation(min, mid), mid, relation(mid, max), max);
	}
	
	private static char relation(int a, int b) {
		
		return a == b ? '=' : '<';
		
	}
}	

