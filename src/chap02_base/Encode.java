package chap02_base;
/**
 * 
 * @ClassName:  Encode   
 * @Description:通过位 （ 一般都是异或 ）运算符 来实现加密    解密  --------原文+密匙=密文     密文+密匙=原文
 * @author: 谢洪伟 
 * @date:   2018年8月13日 下午4:46:26   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Encode {

	public static void main(String[] args) {
		String s="abcde";
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			array[i] = (char) (array[i]^2000);
		}
		System.out.println("加密结果如下");
		System.out.println(new String(array));
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (char) (array[i]^2000);
		}
		System.out.println(new String(array));
	}

}
