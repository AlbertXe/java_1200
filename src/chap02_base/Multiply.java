package chap02_base;
/**
 * 
 * @ClassName:  Multiply   
 * @Description:通过位的左移 右移 来实现运算  2的n次方  
 * @author: 谢洪伟 
 * @date:   2018年8月13日 下午5:05:33   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Multiply {

	public static void main(String[] args) {
		long a=10l;
		System.out.println(a>>1);//位运算  除2
		System.out.println(a<<1);//*2
		System.out.println(a<<2);//*4
		System.out.println(a<<4);//*16
	}

}
