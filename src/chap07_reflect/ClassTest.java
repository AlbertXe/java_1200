package chap07_reflect;

import java.util.Date;
/**
 * 
 * @ClassName:  ClassTest   
 * @Description:获得class 的 不同方法   不同的类型 ==class 的获得方式不同
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午3:12:25   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class ClassTest {
	public static void main(String[] args) throws Exception {
		Class<? extends Date> c1 = new Date().getClass();
		System.out.println(c1);
		String  ss = new String();
		Class c2=boolean.class;
		System.out.println(c2);
		Class<?> c3 = Class.forName("java.lang.String");
		System.out.println(c3);
		Class<Double> c4 = Double.TYPE;
		System.out.println(c4);
	}
}
