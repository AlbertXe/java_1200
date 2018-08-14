package chap04_string;

import java.text.DecimalFormat;

/**
 * 
 * @ClassName:  ConvertMoney   
 * @Description:金额 变中文大写  
 * @author: 谢洪伟 
 * @date:   2018年8月14日 上午10:58:51   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class ConvertMoney {
	
	/**
	 * 0： 
		    比实际数字的位数多，不足的地方用0补上。
		    new DecimalFormat("00.00").format(3.14)  //结果：03.14
		    new DecimalFormat("0.000").format(3.14)  //结果： 3.140
		    new DecimalFormat("00.000").format(3.14)  //结果：03.140
		    比实际数字的位数少：整数部分不改动，小数部分，四舍五入
		    new DecimalFormat("0.000").format(13.146)  //结果：13.146
		    new DecimalFormat("00.00").format(13.146)  //结果：13.15
		    new DecimalFormat("0.00").format(13.146)  //结果：13.15
		#： 
		    比实际数字的位数多，不变。
		    new DecimalFormat("##.##").format(3.14)  //结果：3.14
		    new DecimalFormat("#.###").format(3.14)  //结果： 3.14
		    new DecimalFormat("##.###").format(3.14)  //结果：3.14
		    比实际数字的位数少：整数部分不改动，小数部分，四舍五入
		    new DecimalFormat("#.###").format(13.146)  //结果：13.146
		    new DecimalFormat("##.##").format(13.146)  //结果：13.15
		    new DecimalFormat("#.##").format(13.146)  //结果：13.15
	 * @param d
	 * @return
	 */
	public static String  convert(double d) {
		DecimalFormat format = new DecimalFormat("#0.###");// 特定小数位
		String money = format.format(d);
		
		if (money.indexOf(".")!=-1) {
			String num = money.substring(0, money.indexOf("."));
			if (num.length()>12) {
				System.out.println("数额太大");
				return "";
			}
		}
		String point ="";
		if (money.indexOf(".")!=-1) {
			point="元";
		}else {
			point = "元整";
		}
		String result = getInteger(money) + point + getDecimal(money);
		
	
		
		return null;
	}

	private static String getDecimal(String money) {
		
		
		return null;
	}

	private static String getInteger(String money) {
		if (money.indexOf(".")!=-1) {
			money=money.substring(money.indexOf("."));
		}
		
		money = new StringBuffer(money).reverse().toString();//反转
		StringBuffer temp = new StringBuffer();
		for (int i = 0; i < money.length(); i++) {
//			temp.append(STR_UNIT[i]);
		}
		
		
		return null;
	}
	/**
	 * 百分比输出
	 * @param d
	 * @return
	 */
	public static String percent(double d){
		
		DecimalFormat format = new DecimalFormat();
		format.applyPattern("00.0000%");
		System.out.println(format.format(d));
		return null;
	}
	public static void main(String[] args) {
		percent(0.1234);
	}
}
