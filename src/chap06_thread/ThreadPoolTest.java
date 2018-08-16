package chap06_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @ClassName:  ThreadPoolTest   
 * @Description:创建可重用线程池   
 * @author: 谢洪伟 
 * @date:   2018年8月16日 下午2:10:19   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class ThreadPoolTest {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		long freeMemory = runtime.freeMemory();
		long currentTimeMillis = System.currentTimeMillis();
		
		ExecutorService pool = Executors.newFixedThreadPool(1000);//创建线程池
		for (int i = 0; i < 1000; i++) {
			pool.submit(new Thread());
			
		}
	}
}
