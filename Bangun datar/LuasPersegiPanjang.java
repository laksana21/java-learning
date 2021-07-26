import javax.swing.*;

public class LuasPersegiPanjang
{
	public static void main(String[] args)
	{
		String a = JOptionPane.showInputDialog("Masukan Nilai Pertama!");
		String b = JOptionPane.showInputDialog("Masukan Nilai Kedua!");
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		
		double hasil = (c * d);
		
		System.out.println("Panjang = " + a);
		System.out.println("Lebar = " + b);
		JOptionPane.showMessageDialog(null,"Luas persegi panjang = " + hasil);
	}
}
