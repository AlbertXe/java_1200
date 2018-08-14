package java_1200;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		Runtime run =Runtime.getRuntime();
		run.gc();
		long freeMemory = run.freeMemory();
		long currentTimeMillis = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			new Thread(new Transer(new Bank())).start();
		}
		System.out.println("内存变化="+(freeMemory-run.freeMemory()));
		System.out.println("时间变化="+(currentTimeMillis-System.currentTimeMillis()));
		
		run.gc();
		
		freeMemory=run.freeMemory();
		currentTimeMillis=System.currentTimeMillis();
		ExecutorService pool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 1000; i++) {
			pool.submit(new Transer(new Bank()));
		}
		System.out.println("内存变化="+(freeMemory-run.freeMemory()));
		System.out.println("时间变化="+(currentTimeMillis-System.currentTimeMillis()));
	}
}
