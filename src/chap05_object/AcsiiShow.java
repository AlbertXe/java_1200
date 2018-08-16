package chap05_object;
/**
 * 
 * 利用Chracter 查看及转换 Ascii  包含128 个字符// character基于unicode
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 谢洪伟 
 * @date:   2018年8月15日 上午9:12:18   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class AcsiiShow {
	public static void main(String[] args) {
		int codePointAt = Character.codePointAt("abc", 0); //字符转换成 ascii
		System.out.println(codePointAt);
		char[] chars = Character.toChars(234);
		System.out.println(new String(chars));
		
	}
}
