package chap09_prog_class;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 
 * @ClassName:  桌面联机 工具  == 
 * @Description:编辑文件  == 默认浏览器打开指定网址  ==  打印文件 == 发送email
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午2:22:17   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class DesktopUtil {
	public static void main(String[] args) {
		
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI("www.baidu.com"));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
