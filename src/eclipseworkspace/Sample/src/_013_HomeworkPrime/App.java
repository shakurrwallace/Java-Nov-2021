package _013_HomeworkPrime;

public class App {
	public static void main (String [] args) 
	{
		PrimeNumbers.run();
	}
}
class PrimeNumbers {
	public static void run() {
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int val = Integer.parseInt(kb.nextLine());
		int temp = val;
		
		for (int i = 2; i < temp / 2; i++) {
			if(!NumberUtil.isPrime(i))
				continue;
			while (val != 1) {
				if (val % i == 0) {
					System.out.print(i + " ");
					val /= i;
				}
				else {
					break;
				}	
			}	
		}		
	}
}

class NumberUtil {
	public static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
		
		if (n % 2 == 0)
			return n == 2;
		
		if (n % 3 == 0)
			return n == 3;
		
		if (n % 5 == 0)
			return n == 5;
		
		if (n % 7 == 0)
			return n == 7;
		
		for (int i = 11; i * i <= n; i += 2)
			if (n % i == 0)
				return false;
		
		return true;
	}
}


