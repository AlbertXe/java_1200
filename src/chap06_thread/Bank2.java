package chap06_thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @ClassName:  Bank2   
 * @Description:ReentrantLock可重入锁实现  将要操作的锁起来 线程同步   ==最好 lock  和		synchronized都别用
 * @author: 谢洪伟 
 * @date:   2018年8月16日 上午11:06:54   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Bank2 {
	private long account;
	
	private ReentrantLock lock = new ReentrantLock();

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}
	
	public long deposit(long money){
		lock.lock();
		try {
			account+=money;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		return account;
	}
}
