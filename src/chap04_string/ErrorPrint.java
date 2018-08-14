package chap04_string;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
/**
 * 
 * @ClassName:  ErrorPrint   
 * @Description:将错误直接在　面板中打印　更加直观　而不用看文件  
 * @author: 谢洪伟 
 * @date:   2018年8月14日 下午3:36:13   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class ErrorPrint extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnClick;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorPrint frame = new ErrorPrint();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ErrorPrint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.WEST);
		textField.setColumns(10);
		
		btnClick = new JButton("click");
		btnClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ByteArrayOutputStream os = new ByteArrayOutputStream();
				PrintStream err = System.err;
				System.setErr(new PrintStream(os));
				String num = textField .getText();
				try {
					Integer value = Integer.valueOf(num);
				} catch (NumberFormatException e) {
					
					e.printStackTrace();//这个也是打印流
				}
				String info = os.toString();// 输出流
				if (info .isEmpty()) {
					textArea.setText("转换没有异常");
				} else {
					textArea.setText("异常信息：\n"+info);
				}
				System.setErr(err);
				
			}
		});
		contentPane.add(btnClick, BorderLayout.EAST);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

}
