package chap01_Envir;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
/**
 * 
 * @ClassName:  Calc   
 * @Description:计算器 --spli多符号拆分   符号都要释义
 * @author: 谢洪伟 
 * @date:   2018年8月13日 下午5:18:11   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Calc extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JButton b2;
	private JButton b3;
	private JButton b_add;
	private JButton b_sub;
	private JButton b_point;
	private JButton b0;
	private JButton b9;
	private JButton b8;
	private JButton b7;
	private JButton b_eq;
	private JButton b_minus;
	private JButton b_mul;
	private JButton b6;
	private JButton b5;
	private JButton b4;
	
	StringBuffer sb=new StringBuffer();
	StringBuffer sb2=new StringBuffer();
	private JLabel l1;
	private JButton b1;
	private JButton b_del;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		l1 = new JLabel("结果：");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(155)
					.addComponent(l1)
					.addGap(59))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(l1))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		
		b1 = new JButton("1");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("1");
				l1.setText(sb.toString());
			}
		});
		b1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		b2 = new JButton("2");
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("2");
				l1.setText(sb.toString());
			}
		});
		
		b3 = new JButton("3");
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("3");
				l1.setText(sb.toString());
			}
		});
		
		b4 = new JButton("4");
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("4");
				l1.setText(sb.toString());
			}
		});
		
		b5 = new JButton("5");
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("5");
				l1.setText(sb.toString());
			}
		});
		
		b6 = new JButton("6");
		b6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("6");
				l1.setText(sb.toString());
			}
		});
		
		b7 = new JButton("7");
		b7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("7");
				l1.setText(sb.toString());
			}
		});
		
		b8 = new JButton("8");
		b8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("8");
				l1.setText(sb.toString());
			}
		});
		
		b9 = new JButton("9");
		b9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("9");
				l1.setText(sb.toString());
			}
		});
		
		b_add = new JButton("+");
		b_add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("+");
				l1.setText(sb.toString());
			}
		});
		
		b_mul = new JButton("*");
		b_mul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("*");
				l1.setText(sb.toString());
			}
		});
		
		b0 = new JButton("0");
		b0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("0");
				l1.setText(sb.toString());
			}
		});
		
		b_sub = new JButton("-");
		b_sub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("-");
				l1.setText(sb.toString());
			}
		});
		
		b_minus = new JButton("/");
		b_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append("\\");
				l1.setText(sb.toString());
			}
		});
		
		b_point = new JButton(".");
		b_point.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb.append(".");
				l1.setText(sb.toString());
			}
		});
		
		b_eq = new JButton("=");
		b_eq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String res = sb.toString();
				BigDecimal result=null;
				String[] strings = sb.toString().split("\\+|\\-|\\*|\\\\");
				if (res.contains("+")) {
					result = new BigDecimal(strings[0]).add(new BigDecimal(strings[1]));
				}
				if (res.contains("-")) {
					result = new BigDecimal(strings[0]).subtract(new BigDecimal(strings[1]));
				}
				if (res.contains("*")) {
					result = new BigDecimal(strings[0]).multiply(new BigDecimal(strings[1]));
				}
				if (res.contains("\\")) {
					result = new BigDecimal(strings[0]).divide(new BigDecimal(strings[1]));
				}
				
				sb.append("="+result.toString());
				l1.setText(sb.toString());
			}
		});
		
		b_del = new JButton("清除");
		b_del.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sb=new StringBuffer();
				l1.setText("");
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(b4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(b1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(b7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(b2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
						.addComponent(b5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(b8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(b3, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
						.addComponent(b6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(b9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(0)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(b_add)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(b_sub, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(b_del))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(b_mul, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(b_minus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addComponent(b0, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(b_eq)
								.addComponent(b_point, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
					.addGap(60))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(b1)
						.addComponent(b2)
						.addComponent(b3)
						.addComponent(b_add)
						.addComponent(b_sub)
						.addComponent(b_del))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(b4)
						.addComponent(b5)
						.addComponent(b6)
						.addComponent(b_mul)
						.addComponent(b_minus)
						.addComponent(b_eq, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(b7)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(b8)
							.addComponent(b9)
							.addComponent(b0)
							.addComponent(b_point)))
					.addContainerGap(119, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
	}
}
