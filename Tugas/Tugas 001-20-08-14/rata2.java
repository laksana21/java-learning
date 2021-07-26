import java.util.Scanner;

public class rata2
{
	public static void main(String[] args)
	{
		System.out.println("Masukkan nilai = ");
		double a = new Scanner (System.in) .nextDouble();
		double b = new Scanner (System.in) .nextDouble();
		double c = new Scanner (System.in) .nextDouble();
		double d = new Scanner (System.in) .nextDouble();
		double e = new Scanner (System.in) .nextDouble();
		
		System.out.println("Rata-rata= " + (a+b+c+d+e)/5);
	}
}
