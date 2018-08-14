package chap04_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.test.TestPerson;

/**
 * 
 * @ClassName:  RegEx   
 * @Description:String 匹配正则  
 * @author: 谢洪伟 
 * @date:   2018年8月14日 下午2:08:49   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class RegEx {
	
//				. 任意有一个字符
//				\\d  任意一个数字
//				\\D 	非数字
//				\\s		空白字符
//				\\S		非空白字符
//				\\w		可用于标识符的字符 不包括$
//				\\W		不可用于标识符的字符
	public static void main(String[] args) {
		String reg = "\\p{Lower}{3}";
		String text="abc";
		boolean flag = text.matches(reg);
		System.out.println(flag);
		
		
		Character.isDigit('a');//判断字符是否 数字
		Character.isLetter('a');//判断 字母
		
		draw("123");
	}
	
	public static String draw(String content){
		String reg = "^[\u4e00-\u9fa5]{0,}$";	//匹配0个及以上汉字
		content="我爱中国";
		
//		boolean flag = Pattern.matches(reg, content);
//		System.out.println(flag);
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(content);
		
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			String temp = matcher .group();
			sb.append(temp);
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
}
