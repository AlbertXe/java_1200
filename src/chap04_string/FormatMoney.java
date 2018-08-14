package chap04_string;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * @ClassName:  FormatMoney   
 * @Description:国家不同 输出钱币不同  NumberFormat 格式化数字
 * @author: 谢洪伟 
 * @date:   2018年8月14日 上午10:36:30   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FormatMoney {

	public static void main(String[] args) {
		double money=16.77;
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(format.format(money));
		format=NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println(format.format(money));
		
	}

}
