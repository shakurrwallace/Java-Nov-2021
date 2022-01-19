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

				if (val == 0)
					return;
				System.out.printf("Signum değeri: %d%n", NumberUtil.Signum(val));
			}
		}
	}
	class NumberUtil {
		public static int Signum(int val)
		{
			if (val > 0)
				return 1;

			if (val < 0)
				return -1;
			else
				return 0;

		}
	}


