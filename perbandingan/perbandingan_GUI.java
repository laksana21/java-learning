import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class perbandingan_GUI extends JFrame{
	
	public static void main(String[] args){
		JFrame fr = new JFrame("Perbandingan");
		
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();
		JLabel lb1 = new JLabel("Nilai A");
		JLabel lb2 = new JLabel("Nilai B");
		JButton tb1 = new JButton("Bandingkan");
		
		fr.setSize(405,300);
		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.getContentPane().setLayout(null);
		
		fr.add(tf1);
		fr.add(tf2);
		fr.add(lb1);
		fr.add(lb2);
		fr.add(tb1);
		
		tf1.setBounds(80,20,280,25);
		tf2.setBounds(80,50,280,25);
		lb1.setBounds(20,20,50,25);
		lb2.setBounds(20,50,50,25);
		tb1.setBounds(20,100,340,25);
		
		tb1.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e){
				String hasil = "Error";
				String a = tf1.getText();
				String b = tf2.getText();
				
				int aa = Integer.parseInt(a);
				int bb = Integer.parseInt(b);
				
				if(aa > bb){
					hasil = "Nilai A lebih besar dari nilai B.";
				}
				else if(aa < bb){
					hasil = "Nilai B lebih besar dari nilai A.";
				}
				else if(aa == bb){
					hasil = "Nilai A dan B sama besar.";
				}
				
				JOptionPane.showMessageDialog(null, hasil);
			}
		});
		
		fr.setVisible(true); 
    }
}
