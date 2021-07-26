import java.util.Scanner;
public class akucintarpl_dowhile
{
	public static void main(String [] args)
	{
		System.out.print("Masukkan Angka : ");
		double a = new Scanner (System.in) .nextDouble();
		int i = 0;
		do
		{
			System.out.println("Aku Cinta RPL");
			i++;
		}
		while (i<a);
	}
}
