package java_1200;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Set;

public class Clock {
	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		Properties properties = System.getProperties();
		Set<Object> keySet = properties.keySet();
		for (Object object : keySet) {
			System.out.println(object);
		}
		System.gc();
		Runtime runtime = Runtime.getRuntime();
		long freeMemory = runtime.freeMemory();
		long totalMemory = runtime.totalMemory();
		System.out.println(freeMemory/1024);
		System.out.println(totalMemory/1024);
		System.out.println(freeMemory*100/totalMemory);
//		Collection<Object> values = properties.values();
//		for (Object object : values) {
//			System.out.println(object);
//		}
		System.out.println("hour:"+hour+"minute:"+minute+"second"+second);
	}
}
