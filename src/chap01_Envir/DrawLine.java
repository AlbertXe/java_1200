package chap01_Envir;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLine extends JPanel {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(110, 10, 140, 120);//画笔 父类会实例化画笔对象
	}
	//不用调用方法直接就画了
	public static void main(String[] args) {
		DrawLine drawLine=new DrawLine();//画布
		JFrame j =new JFrame();//画框
		j.add(drawLine);
		j.setSize(300, 300);
		j.setVisible(true);
	}
	
}
