/*----------------------------------------------------------------------------------------------------------------------
	Parametresi ile aldığı int türden sayının negatif mi sıfır mı pozitif mi olduğunu test eden signum isimli metodu yazınız ve test ediniz
	metot pozitif için 1 negatif için -1 eksi bir ve sıfır için sıfır döndürecektir
----------------------------------------------------------------------------------------------------------------------*/
package _009_HomeworkSignum;

class App1 {
	public static void main(String [] args)
	{
		Signum.Run();
	}
}

class Signum {
	public static void Run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		for (;;) {

			System.out.println("signum değerini giriniz: ");
			int val = Integer.parseInt(kb.nextLine());

			System.out.printf("Signum değeri: %d%n", NumberUtil.Signum(val));
				
			if (val == 0)
				return;	
		}
	}
}

class NumberUtil {
	public static int Signum(int val)
	{
		if (val > 0) {
			return 1; 
		} else if (val < 0) {
			return -1; 
		}
			
		return 0;

	}
}

/*You are given a string S consisting of letters 'a' and 'b'.
 *  The task is to rearrange letters in S so that it contains three consecutive letters 'a' and three consecutive letters 'b'.
 *   What is the minimum necessary number of swaps of neighbouring letters to achieve this??
 
 ababab
 
 
 aaabbb
 
    
 abbbaa

 aabbba
 
 aaabbb   
  
*/


