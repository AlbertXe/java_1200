package chap06_thread.lock;

import java.util.concurrent.CountDownLatch;

/**
 * 
 * @ClassName:  CountDownLatchTest   
 * @Description:主线程等待  其他线程执行完毕 再执行；
 * @author: 谢洪伟 
 * @date:   2018年12月17日 上午9:21:39
 */
public class CountDownLatchTest {
	private static CountDownLatch latch = new CountDownLatch(5);
	
	//1.老板线程   2.员工线程
	
	static class Boss extends Thread{

		@Override
		public void run() {
			try {
				System.out.println("老板线程等待"+latch.getCount()+"员工到场");
				latch.await();
				System.out.println("员工全部到场现在开会");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	static class Employee extends Thread{
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+"员工到场");
			latch.countDown();
		}
	}
	
	public static void main(String[] args) {
		new Boss().start();
		long count = latch.getCount();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			new Employee().start();
			System.out.println(latch.getCount());
		}
		
	}
}
