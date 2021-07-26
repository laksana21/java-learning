public class op_ternary
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 6;
		
		//jika nilai a lebih besar dari b, maka hasil = salah, kebalikannya benar
		String hasil = a > b ? "Nilai a lbih besar dari b":"nilai a lebih kecil dari b";
		System.out.println(hasil);
	}
}
