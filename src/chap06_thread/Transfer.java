package chap06_thread;

import java.util.concurrent.Callable;
/**
 * 
 * @ClassName:  Transfer   
 * @Description:又返回值的线程   
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午1:57:57   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Transfer implements Callable<Integer> {
	private Bank3 bank = new Bank3();
	@Override
	public Integer call() throws Exception {
		bank.deposit(10);
		
		return bank.getAccount();
	}
	
}
