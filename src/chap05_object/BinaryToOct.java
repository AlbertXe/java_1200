package chap05_object;
/**
 * 
 * @ClassName:  BinaryToOct   
 * @Description:进制	转化     以及查看 取值范围
 * @author: 谢洪伟 
 * @date:   2018年8月14日 下午4:39:31   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class BinaryToOct {
	public static Integer change2_8(Integer a){
		String resutl = Integer.toOctalString(a);
		System.out.println(resutl);
		return new Integer(resutl);
	}
	public static void main(String[] args) {
		change2_8(16);
		
		int maxValue = Integer.MAX_VALUE;
		byte maxValue2 = Byte.MAX_VALUE;
		System.out.println(maxValue2);
		System.out.println(maxValue);
	}
}
