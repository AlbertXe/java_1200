package chap07_reflect;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/**
 * 
 * @ClassName:  MtthodTest   
 * @Description:反射调用方法 以及 创建 构造对象
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午3:43:06   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class MtthodTest {
	public static void main(String[] args) throws Exception, SecurityException {
		Method method = Math.class.getDeclaredMethod("sin", Double.TYPE);//方法名称  及 形参 类型
		Double b = (Double) method.invoke(null, 10);// 调用对象  及  参数值
		System.out.println(b);
		
		Method method2 = String.class.getDeclaredMethod("equals", Object.class);
		boolean b2 = (boolean) method2.invoke(new String("明日科技"), "明日科技");
		System.out.println(b2);
		
		Constructor<File> constructor = File.class.getDeclaredConstructor(String.class);//构造的形参类型
		File file = constructor.newInstance("./file.txt");
		file.createNewFile();
		
	}
}
