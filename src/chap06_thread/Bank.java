package chap06_thread;
/**
 * 
 * @ClassName:  Bank   
 * @Description:volatile 为域变量提供免锁机制   告诉虚拟机 该域会被其他线程更新 使用需重新计算 而不是直接使用 内存中的值
 * @author: 谢洪伟 
 * @date:   2018年8月16日 上午11:01:42   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Bank {
	private volatile long account;

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}
	
	public long deposit(long money) {
		return account += money;
	}
}
