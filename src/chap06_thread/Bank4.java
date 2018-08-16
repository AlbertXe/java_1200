package chap06_thread;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * 
 * @ClassName:  Bank4   
 * @Description:原子变量解决	线程同步 
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午2:35:48   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Bank4 {
	private AtomicInteger account = new AtomicInteger(100);
	/**
	 * 下面的操作都是 原子的：
	 * 引用变量 和 大部分 原始变量的（long double 除外） 读写 操作
	 * @param money
	 */
	public void deposit(int money){
		account.addAndGet(money);//存钱
		
	}
}
