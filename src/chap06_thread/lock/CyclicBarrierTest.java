package chap06_thread.lock;

import java.util.concurrent.CyclicBarrier;

/**
 * 
 * @ClassName:  CyclicBarrierTest   
 * @Description:所有线程等待  。满足线程数就开始
 * @author: 谢洪伟 
 * @date:   2018年12月17日 下午3:55:50
 */
public class CyclicBarrierTest {
	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(4);
		for (int i = 0; i < 4; i++) {
			new Writer(barrier).start();
		}
		System.out.println(Thread.class.getName()+"所有线程写入完毕执行总线程");// 这个一直执行
		
	}
	
	static class Writer extends Thread{
		private CyclicBarrier barrier;
		
		
		public Writer(CyclicBarrier barrier) {
			this.barrier = barrier;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+"写数据");
			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+"写入完毕");
				barrier.await();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
	}
}
