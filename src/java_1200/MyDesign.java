package java_1200;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;

public class MyDesign {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDesign window = new MyDesign();
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
	public MyDesign() {
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
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
			}
		});
		button_1.setBounds(67, 87, 48, 43);
		frame.getContentPane().add(button_1);
		
		JButton button_3 = new JButton("=");
		button_3.setForeground(Color.RED);
		button_3.setBounds(363, 49, 71, 43);
		frame.getContentPane().add(button_3);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 434, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("2");
		button.setBounds(135, 87, 48, 43);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(201, 87, 48, 43);
		frame.getContentPane().add(button_2);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(67, 140, 48, 43);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(135, 140, 48, 43);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(201, 140, 48, 43);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(67, 193, 48, 43);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(135, 193, 48, 43);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(201, 193, 48, 43);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
			}
		});
		button_10.setBounds(274, 49, 48, 43);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(274, 102, 48, 43);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.setBounds(274, 155, 48, 43);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.setBounds(274, 209, 48, 43);
		frame.getContentPane().add(button_13);
	}
}
