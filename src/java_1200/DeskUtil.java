package java_1200;

import java.awt.Desktop;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

public class DeskUtil {
	public static void main(String[] args) {
		while (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.edit(new File("C:\\Users\\Administrator.C64-20171130OTM\\Desktop\\all.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
