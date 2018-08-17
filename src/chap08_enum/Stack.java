package chap08_enum;

import java.util.LinkedList;

/**
 * 
 * @ClassName:  Stack   
 * @Description:自己写个栈  带泛型 （栈  先入后出）  
 * 				数组的泛型用反射  Array.newInstance(Class,size)
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午12:12:02   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */

public class Stack<T> {
	
	private LinkedList<T> list = new LinkedList<>();
	
	public LinkedList<T>  push(T t) {
		list.addFirst(t);
		return list;
	}
	
	public T pop(){
		return list.removeFirst();
	}
	
	public boolean empty() {
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("xie");	
		stack.push("hong");
		stack.push("wei");
		
		while (!stack.empty()) {
			System.out.println(stack.pop());
			
		}
	}
}
