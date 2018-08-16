package chap07_reflect;

import java.lang.reflect.TypeVariable;

/**
 * 
 * @ClassName:  ClassTest01   
 * @Description:获得类的 信息
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午3:23:33   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class ClassTest01 {
	public static void main(String[] args) throws Exception {
		Class<?> clz = Class.forName("java.util.ArrayList");
		
		System.out.println("类标准名称："+ clz.getCanonicalName());
		System.out.println("类的修饰符："+ clz.getModifiers());
		TypeVariable<?>[] parameters = clz.getTypeParameters();//类泛型参数
		clz.getGenericInterfaces();//类实现的接口
		clz.getGenericSuperclass();//类直接继承类
		clz.getAnnotations();//类的注解信息
		
		clz.getDeclaredConstructors();	//非继承 类构造
		clz.getDeclaredFields();
		clz.getDeclaredMethods();
		clz.getDeclaredClasses();//内部类
		
	}
}
