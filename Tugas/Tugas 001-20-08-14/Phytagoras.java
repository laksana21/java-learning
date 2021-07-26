import java.util.Scanner;
public class Phytagoras
{
	public static void main(String[] Dadali) 
	{
		System.out.print("Masukkan Alas : ");
		double a = new Scanner (System.in) .nextDouble();
		System.out.print("Masukkan Tinggi : ");
		double t = new Scanner (System.in) .nextDouble();
		double sm = Math.sqrt((a*a)+(t*t));
		System.out.println("Sisi Miring " + sm);	
	}
}
