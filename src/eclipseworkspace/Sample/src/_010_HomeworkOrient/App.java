package _010_HomeworkOrient;

public class App {

	public static void main(String[] args) 
	{
		String binary = findBinary(1041);
		for (int i = 0; i < binary.length(); i++) {
			System.out.println(binary.charAt(i));
		}
	}
	
	public static String findBinary (int n) {
        String binary = "";
        while (n != 0) {
            binary = n % 2 + binary;
        	n /= 2;
        } 
        return binary;
    }
}
//class Duration() {
//	public static void Run (long n )
//	{		
//	java.util.Scanner kb = new java.util.Scanner(System.in);
//
//	System.out.println("Süreyi giriniz: ");
//	long n = Integer.parseInt(kb.nextLine());
//	
//
//
//	}
//}
