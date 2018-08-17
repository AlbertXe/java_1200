package chap09_prog_class;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * 
 * @ClassName:  Clock   
 * @Description: GregorianCalendar时间工具类 
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午1:48:49   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Clock {
	
	
	public static String getTime() {
		Calendar calendar = new GregorianCalendar();
		int hour = calendar .get(Calendar.HOUR_OF_DAY);
		int minute = calendar .get(Calendar.MINUTE);
		int second = calendar .get(Calendar.SECOND);
		
		System.out.println(hour+":"+minute+":"+second);
		
		return null;
	}
	
	public static void main(String[] args) {
		getTime();
	}
}
