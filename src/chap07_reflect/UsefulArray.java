package chap07_reflect;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * @ClassName:  UsefulArray   
 * @Description:反射数组 扩容两倍  
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午4:04:53   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class UsefulArray {
	public static Object increaseArray(Object source){
		Class<? extends Object> clz = source.getClass();
		if (clz.isArray()) {
			Class<?> type = clz.getComponentType();//获得 数组元素类型
			int length = Array.getLength(source);
			Object newInstance = Array.newInstance(type, length*2);
			System.arraycopy(source, 0, newInstance, 0, length);
			
			return newInstance; 
		}
		return null;
	}
	
	public static void main(String[] args) {
		int []a={1,2,3};
		a= (int[]) increaseArray(a);
		System.out.println(a.length);
	}
}
