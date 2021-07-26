import javax.swing.*;

public class ratarata{
	public static void main(String[] mamat){
		String a = JOptionPane.showInputDialog("Masukan Nilai Pertama!");
		String b = JOptionPane.showInputDialog("Masukan Nilai Kedua!");
		String c = JOptionPane.showInputDialog("Masukan Nilai Ketiga!");
		String d = JOptionPane.showInputDialog("Masukan Nilai Keempat!");
		String e = JOptionPane.showInputDialog("Masukan Nilai Kelima!");
		
		int aku = Integer.parseInt(a);
		int sayang = Integer.parseInt(b);
		int kamu = Integer.parseInt(c);
		int selalu = Integer.parseInt(d);
		int selamanya = Integer.parseInt(e);
		
		double mencintaimu = (aku+sayang+kamu+selalu+selamanya)/5;
		
		JOptionPane.showMessageDialog(null, "Nilai rata rata aku suka kamu adalah " + mencintaimu);
		
	}
}
