package chap06_thread;

import java.util.concurrent.Semaphore;
/**
 * 
 * @ClassName:  Transfer01   
 * @Description:使用信号量实现线程同步 
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午2:30:07   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Transfer01 implements Runnable {
	private Bank bank=new Bank();//最基础PO
	
	private Semaphore semaphore;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				semaphore.acquire();//获得一个许可
				bank.deposit(10);
				semaphore.release();//释放一个许可
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
