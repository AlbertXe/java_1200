package chap06_thread;
/**
 * 
 * @ClassName:  Bank3   
 * @Description:ThreadLocal 管理变量 每个线程获得变量的副本 相互独立  空间换时间 
 * @author: 谢洪伟 
 * @date:   2018年8月16日 上午11:19:15   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Bank3 {
	private ThreadLocal<Integer> account = new ThreadLocal<Integer>(){
		@Override
		protected Integer initialValue() {
			return 100;
		}
	};

	public Integer getAccount() {
		return account.get();
	}

	public void setAccount(ThreadLocal<Integer> account) {
		this.account = account;
	}
	
	public void deposit( Integer money) {
		account.set(account.get()+money);
	}
}
