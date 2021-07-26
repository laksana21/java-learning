import javax.swing.*;

public class ArusListrik{
	public static void main(String[] mamat)
	{
		String a = JOptionPane.showInputDialog("Masukan Nilai yang ingin dicari! (V,I,R)");
		if (a=="1")
		{
			String i = JOptionPane.showInputDialog("Masukan Nilai Arus!");
			String r = JOptionPane.showInputDialog("Masukan Nilai Hambatan!");
			
			int arus = Integer.parseInt(i);
			int hambat = Integer.parseInt(r);
			
			double hasil = arus*hambat;
			JOptionPane.showMessageDialog(null, "Nilai tegangan adalah " + hasil);
			
		}
		else if (a=="2")
		{
			String v = JOptionPane.showInputDialog("Masukan Nilai Tegangan!");
			String r = JOptionPane.showInputDialog("Masukan Nilai Hambatan!");
			
			int tegang = Integer.parseInt(v);
			int hambat = Integer.parseInt(r);
			
			double hasil = tegang/hambat;
			JOptionPane.showMessageDialog(null, "Nilai kuat arus adalah " + hasil);
			
		}
		else if (a=="3")
		{
			String v = JOptionPane.showInputDialog("Masukan Nilai Tegangan!");
			String i = JOptionPane.showInputDialog("Masukan Nilai Kuat Arus!");
		
			int tegang = Integer.parseInt(v);
			int arus = Integer.parseInt(i);

			double hasil = tegang/arus;
			JOptionPane.showMessageDialog(null, "Nilai hambatan adalah " + hasil);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Maaf. Statemen salah!");
		}
	}
}
