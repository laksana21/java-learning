package kalkuform;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class kalkuform {

	private JFrame frame;
	private JTextField textField;
	//variable untuk perhitungan
		double bilangan_1 = 0.0, bilangan_2 = 0.0;
		boolean kedua = false;
		String operator ="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkuform window = new kalkuform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kalkuform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 153, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					String data = textField.getText().toString();
					if(kedua){
						bilangan_1 = Double.parseDouble(data);
						data = "0";
						textField.setText("1");
						kedua = false;
					}
					if(!data.equals("0"))
						textField.setText(data + "1");
					else
						textField.setText("1");
			}
		});
		button.setBounds(10, 99, 54, 23);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("2");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "2")
					;
				else
					textField.setText("2");
			}
		});

		btnNewButton.setBounds(74, 99, 55, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_1 = new JButton("3");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("3");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "3")
					;
				else
					textField.setText("3");
			}
		});

		button_1.setBounds(139, 99, 54, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("4");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "4")
					;
				else
					textField.setText("4");
			}
		});

		button_2.setBounds(10, 135, 54, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("5");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "5")
					;
				else
					textField.setText("5");
			}
		});

		button_3.setBounds(74, 135, 54, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("6");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "6")
					;
				else
					textField.setText("6");
			}
		});

		button_4.setBounds(139, 135, 54, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("7");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "7")
					;
				else
					textField.setText("7");
			}
		});

		button_5.setBounds(10, 169, 54, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("8");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "8")
					;
				else
					textField.setText("8");
			}
		});

		button_6.setBounds(74, 169, 54, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("9");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "9")
					;
				else
					textField.setText("9");
			}
		});

		button_7.setBounds(139, 169, 54, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String data = textField.getText().toString();
				if(kedua){
					bilangan_1 = Double.parseDouble(data);
					data = "0";
					textField.setText("0");
					kedua = false;
				}
				if(!data.equals("0"))
					textField.setText(data + "0")
					;
				else
					textField.setText("0");
			}
		});

		button_8.setBounds(74, 203, 54, 17);
		frame.getContentPane().add(button_8);
		
		JButton btnC = new JButton("C");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("0");	
			}
		});

		btnC.setBounds(139, 203, 54, 17);
		frame.getContentPane().add(btnC);
		
		JButton button_9 = new JButton("+");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operator = "+";
				kedua = true;
			}
		});

		button_9.setBounds(244, 99, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operator = "-";
				kedua = true;
			}
		});

		button_10.setBounds(244, 135, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton btnX = new JButton("X");
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operator = "X";
				kedua = true;
			}
		});

		btnX.setBounds(244, 169, 89, 23);
		frame.getContentPane().add(btnX);
		
		JButton button_12 = new JButton("/");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operator = "/";
				kedua = true;
				
			}
		});

		button_12.setBounds(244, 200, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double hasil = 0.0;
				String data=textField.getText().toString();
				bilangan_2 = Double.parseDouble(data);
				switch(operator){
				case "+" :
					hasil = bilangan_1 + bilangan_2;
					break;
				case "-":
					hasil = bilangan_1 - bilangan_2;
					break;
				case "X":
					hasil = bilangan_1 * bilangan_2;
					break;
				case "/":
					hasil = bilangan_1 / bilangan_2;
					break;
				default :
					break;
						
				}
				
				operator = "";
				textField.setText(""+hasil);
				
				
			}
		});

		button_13.setBounds(173, 34, 89, 23);
		frame.getContentPane().add(button_13);
	}
}
