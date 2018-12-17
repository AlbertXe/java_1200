package chap06_thread.lock;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * 
 * @ClassName:  RWDictionary   
 * @Description:使用ReentractReadWriteLock 提高 collection 的并发性
 * 使用范围： collection 数据很多 ，读 多于 写； entail开销 大于 同步的开销
 * @author: 谢洪伟 
 * @date:   2018年12月6日 下午4:07:07
 */
public class RWDictionary {
	private final Map<String,String> map = new TreeMap<>();
	private final ReentrantReadWriteLock lock =  new ReentrantReadWriteLock();
	private final ReadLock r = lock.readLock();
	private final WriteLock w = lock.writeLock();
	
	public String get(String key){
		r.lock();
		try {
			return map.get(key);
		} finally {
			r.unlock();
		}
	}
	
	public String[] getAllKeys(){
		r.lock();
		try {
			return (String[]) map.keySet().toArray();
		} finally {
			r.unlock();
		}
	}
	
	public String put(String key,String value){
		w.lock();
		try {
			return map.put(key, value);
		} finally {
			w.unlock();
		}
	}
	
	public void clear(){
		w.lock();
		try {
			map.clear();
		} finally {
			w.unlock();
		}
	}
}
