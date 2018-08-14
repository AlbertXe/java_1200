package chap01_Envir;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawText extends JPanel {

	@Override
	public void paint(Graphics paramGraphics) {
		// TODO Auto-generated method stub
		super.paint(paramGraphics);
		String s ="只要努力";
		Font f =new Font("宋体", 3,22);
		paramGraphics.setFont(f);
		paramGraphics.drawString(s, 100, 100);
	}
	public static void main(String[] args) {
		JFrame j =new JFrame();
		j.add(new DrawText());
		j.setSize(300, 300);
		j.setVisible(true);
	}
	

}
