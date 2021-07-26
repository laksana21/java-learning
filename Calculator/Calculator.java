import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Calculator extends JFrame{

	JButton tombol1 = new JButton("Luas P. Panjang");
	JButton tombol2 = new JButton("Keliling P. Panjang");
	
	JButton tombol3 = new JButton("Luas Lingkaran");
	JButton tombol4 = new JButton("Keliling Lingkaran");
	
	JButton tombol5 = new JButton("Luas Segitiga");
	JButton tombol6 = new JButton("Keliling Segitiga");
	
	JButton tombol7 = new JButton("Luas Kubus");
	JButton tombol8 = new JButton("Volume Kubus");
	
	JButton tombol9 = new JButton("Luas Lms. Segi 4");
	JButton tombol10 = new JButton("Volume Lms. Segi 4");
	
	JButton tombol11 = new JButton("Luas Tabung");
	JButton tombol12 = new JButton("Volume Tabung");
	
	JLabel text_label = new JLabel("Pilih & Klik 1 tombol");

		public Calculator(){
			super("Calculator");
			this.setSize(355,300);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
                this.getContentPane().setLayout(null);
                this.add(tombol1);
                this.add(tombol2);
                this.add(tombol3);
                this.add(tombol4);
                this.add(tombol5);
                this.add(tombol6);
                this.add(tombol7);
                this.add(tombol8);
                this.add(tombol9);
                this.add(tombol10);
                this.add(tombol11);
                this.add(tombol12);
                this.add(text_label);
                
                tombol1.setBounds(10,10,150,25);
                tombol2.setBounds(10,40,150,25);
                tombol3.setBounds(10,70,150,25);
                tombol4.setBounds(10,100,150,25);
                tombol5.setBounds(10,130,150,25);
                tombol6.setBounds(10,160,150,25);
                tombol7.setBounds(180,10,150,25);
                tombol8.setBounds(180,40,150,25);
                tombol9.setBounds(180,70,150,25);
                tombol10.setBounds(180,100,150,25);
                tombol11.setBounds(180,130,150,25);
                tombol12.setBounds(180,160,150,25);
                text_label.setBounds(10,190,150,25);
                
                tombol1.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Luas Persegi Panjang");
                                String a = JOptionPane.showInputDialog("Masukan Nilai Panjang!");
								String b = JOptionPane.showInputDialog("Masukan Nilai Lebar!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
		
								double hasil = (aa * bb);
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Luas Persegi panjang adalah " + hasil);
                        }
                });
                tombol2.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Keliling Persegi Panjang");
                                String a = JOptionPane.showInputDialog("Masukan Nilai Panjang!");
								String b = JOptionPane.showInputDialog("Masukan Nilai Lebar!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
		
								double hasil = (aa + bb)*2;
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Keliling Persegi panjang adalah " + hasil);
                        }
                });
                tombol3.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Luas Lingkaran");
                                String a = JOptionPane.showInputDialog("Masukan Jari-jari!");

								int aa = Integer.parseInt(a);
		
								double hasil = 3.14*aa*aa;
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Luas lingkaran adalah " + hasil);
                        }
                });
                tombol4.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Keliling Lingkaran");
                                 String a = JOptionPane.showInputDialog("Masukan Jari-jari!");

								int aa = Integer.parseInt(a);
		
								double hasil = (aa*2)*3.14;
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Keliling lingkaran adalah " + hasil);
                        }
                });
                tombol5.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Luas Segitiga");
                                String a = JOptionPane.showInputDialog("Masukan Alas!");
								String b = JOptionPane.showInputDialog("Masukan Tinggi!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
		
								double hasil = (aa*bb)/2;
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Luas segitiga adalah " + hasil);
                        }
                });
                tombol6.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Keliling Segitiga");
                                String a = JOptionPane.showInputDialog("Masukan Sisi 1!");
								String b = JOptionPane.showInputDialog("Masukan Sisi 2!");
								String c = JOptionPane.showInputDialog("Masukan Sisi 3!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
								int cc = Integer.parseInt(c);
		
								double hasil = aa+bb+cc;
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Luas segitiga adalah " + hasil);
                        }
                });
                tombol7.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Luas Kubus");
                                String a = JOptionPane.showInputDialog("Masukan Panjang Sisi!");

								int aa = Integer.parseInt(a);
		
								double hasil = (aa*aa)*6;
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Luas Kubus adalah " + hasil);
                        }
                });
                tombol8.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Volume Kubus");
                                String a = JOptionPane.showInputDialog("Masukan Panjang Sisi!");

								int aa = Integer.parseInt(a);
		
								double hasil = aa*aa*aa;
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Volume Kubus adalah " + hasil);
                        }
                });
                tombol9.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Luas Limas Segiempat");
                                String a = JOptionPane.showInputDialog("Masukan Sisi Alas!");
								String b = JOptionPane.showInputDialog("Masukan Tinggi!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
								
								int c = ((aa/2)*(aa/2)) + (bb*bb);
								double d = (Math.sqrt(c));
		
								double hasil = (aa*aa) + (((aa*d)/2)*4);
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Luas limas segi empat adalah " + hasil);
                                
                        }
                });
                tombol10.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Volume Limas Segiempat");
                                String a = JOptionPane.showInputDialog("Masukan Sisi Alas!");
								String b = JOptionPane.showInputDialog("Masukan Tinggi!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
		
								double hasil = (((aa*aa)/3)*bb);
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Volume limas segi empat adalah " + hasil);
                        }
                });
                tombol11.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Luas Tabung");
                                String a = JOptionPane.showInputDialog("Masukan Nilai Tinggi!");
								String b = JOptionPane.showInputDialog("Masukan Nilai Jari-jari Alas!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
		
								double hasil = ( ((3.14*bb*bb)*2) + ((3.14*(bb*2))*aa) );
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Luas tabung adalah " + hasil);
                        }
                });
                tombol12.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                text_label.setText("Volume Tabung");
                                String a = JOptionPane.showInputDialog("Masukan Nilai Tinggi!");
								String b = JOptionPane.showInputDialog("Masukan Nilai Jari-jari!");

								int aa = Integer.parseInt(a);
								int bb = Integer.parseInt(b);
		
								double hasil = ((3.14*bb*bb)*aa);
								
								text_label.setText("Pilih & Klik 1 tombol");
								JOptionPane.showMessageDialog(null, "Volume tabung adalah " + hasil);
                        }
                });
                show();
               
        }
       
        public static void main(String[] args){
                new Calculator();
        }
}
