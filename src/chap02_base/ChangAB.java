package chap02_base;
/**
 * 
 * @ClassName:  ChangAB   
 * @Description:不增加变量 交换AB的值     通过异或^
 * @author: 谢洪伟 
 * @date:   2018年8月13日 下午5:09:10   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class ChangAB {
	public static void main(String[] args) {
		long a=10l;
		long b=20l;
//		a=a^b;// 	a 就成了ab差异
//		b=b^a;//	b和差异 就成了a 赋值给b		
//		a=b^a;//	
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
	}
}
