// paket yang diperlukan
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
class ContohTombol extends JFrame{
        // attribut
        //membuat tombol
        JButton tombol1 = new JButton("Tombol 1");
        JButton tombol2 = new JButton("Tombol 2");
        JLabel text_label = new JLabel("Pilih & Klik 1 tombol");
       
        //konstruktor
        public ContohTombol(){
                //frame seting---------------------------------------------------------------------
                //memanggil konstruktor kelas induk (JFrame)
                super("Contoh Tombol");
                //seting besar frame 400 x 400 px
                this.setSize(200,200);
                //seting agar bisa ditutup
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                //seting kemunculan frame di tengah window
                this.setLocationRelativeTo(null);
                //seting layout frame
                this.getContentPane().setLayout(null);
                //frame seting---------------------------------------------------------------------
                //menambahkan komponen ke frame dan seting letak
                this.add(tombol1);
                this.add(tombol2);
                this.add(text_label);
                // setbounds(x,y,lebar,tinggi)
                tombol1.setBounds(10,10,150,25);
                tombol2.setBounds(10,40,150,25);
                text_label.setBounds(10,70,150,25);
                //seting aksi tombol
                tombol1.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                // kode disini; saat di klik string text_label akan berubah
                                text_label.setText("Tombol 1 di klik");
                        }
                });
                tombol2.addActionListener(new ActionListener( ) {
                        public void actionPerformed(ActionEvent e){
                                // kode disini; saat di klik string text_label akan berubah
                                text_label.setText("Tombol 2 di klik");
                        }
                });
                // menampilkan frame
                show();
               
        }
       
        public static void main(String[] args){
                new ContohTombol();
        }
}
