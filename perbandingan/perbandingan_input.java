import java.util.Scanner;

public class perbandingan_input
{
	public static void main(String[] args)
	{
		System.out.println("Perbandingan Input.");
		System.out.println(" ");
		System.out.println("Masukkan nilai A = ");
		double a = new Scanner (System.in) .nextDouble();
		System.out.println("Masukkan nilai B = ");
		double b = new Scanner (System.in) .nextDouble();
		
		if( a > b )
		{
			System.out.println("Nilai A lebih besar dari B.");
		}
		else
		{
			System.out.println("Nilai B lebih besar dari A.");
		}
	}
}
