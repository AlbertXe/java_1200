package chap06_thread.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * 
 * @ClassName:  CacheData   
 * @Description:实现对缓存 的锁降级 。 就是对缓存的具体 写操作 上 写锁  其他的上读锁  。 
 * 基于AQS 实现的；自定义同步器（继承AQS） 需要在一个同步状态（一个整型变量state ；按位切割使用，高16位读，低16位写）  上维护 多个读线程 和一个写线程 状态
 * @author: 谢洪伟 
 * @date:   2018年12月6日 下午5:16:01
 */
public class CacheData {
	Object data;
	volatile boolean cacheValid; // 缓存是否有效
	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	void processCacheData(){
		lock.readLock().lock();
		
		if (!cacheValid) {// 无效
			lock.readLock().unlock(); // 写锁前 先解锁 读锁
			lock.writeLock().lock();
			if (!cacheValid) {
				data = "hello";
				cacheValid = true;
			}
			// 锁降级  在释放写锁前 获取读锁
			lock.readLock().lock();
			lock.writeLock().unlock();
			
		}
		
		// 对数据做操作
		System.out.println(data);
		lock.readLock().unlock();
	}
	
}
