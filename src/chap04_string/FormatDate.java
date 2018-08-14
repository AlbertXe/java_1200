package chap04_string;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.math.NumberUtils;
/**
 * 
 * @ClassName:  FormatDate   
 * @Description:DateFormat 来格式化 date   0 和 # 都是占位符
 * @author: 谢洪伟 
 * @date:   2018年8月14日 上午10:57:12   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FormatDate {

	public static void main(String[] args) {
		DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
		String date = format.format(new Date());
		System.out.println(date);
		
		boolean number = NumberUtils.isNumber("12345");
		System.out.println(number);
		if (number) {
			JOptionPane.showMessageDialog(null, "是数字");
		}
	}

}
