package chap06_thread.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();// 读写锁
	
	public static void main(String[] args) {
		final ReadWriteLockTest test = new ReadWriteLockTest();
		
		ExecutorService service = Executors.newCachedThreadPool();//建立N 个线程
		
		service.execute(new Runnable() {
			@Override
			public void run() {
				test.readFile(Thread.currentThread());
			}
		});
		
		ExecutorService service2 = Executors.newCachedThreadPool();
		
		service2.execute(new Runnable() {
			@Override
			public void run() {
				test.readFile(Thread.currentThread());
			}
		});
		
	}

	protected void writeFile(Thread thread) {
		lock.writeLock().lock();
		boolean writeLocked = lock.isWriteLocked();
		if (writeLocked) System.out.println("当前是写锁");
		
		try {
			for (int i = 0; i < 5; i++) {
				try {
					thread.sleep(200);
					System.out.println("线程名：" + thread.getName() + "   进行写操作");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(thread.getName() + "写操作完毕！！！！");
		} finally {
			System.out.println("释放写锁");
			lock.writeLock().unlock();
		}
		
	}

	protected void readFile(Thread thread) {
		lock.readLock().lock();
		boolean writeLocked = lock.isWriteLocked();// 是否被 写锁了
		if (!writeLocked) System.out.println("当前为读锁");
			
		try {
			for (int i = 0; i < 5; i++) {
				try {
					thread.sleep(200);
					System.out.println("线程名：" + thread.getName() + "   正在进行读操作");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(thread.getName() + "读操作完毕！！！");
		} finally {
			System.out.println("释放读锁");
			lock.readLock().unlock();// 解锁
		}
		
	}
}
