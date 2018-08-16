package chap07_reflect.dymatic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler {

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// 调用方法的主题对象  == 调用的具体方法          == 方法形参
		System.out.println("代理在处理");
		return null;
	}
	
	

}
