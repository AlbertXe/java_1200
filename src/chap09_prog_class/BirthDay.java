package chap09_prog_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @ClassName:  BirthDay   
 * @Description:根据年月日  和今天差距算岁数 
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午2:01:27   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class BirthDay {
	public static int getAge() throws Exception{
		String birth = "19900105";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(birth);
		
		GregorianCalendar birthday = new GregorianCalendar();
		birthday.setTime(date);
		
		GregorianCalendar today = new GregorianCalendar();
		int age = today.get(Calendar.YEAR)-birthday.get(Calendar.YEAR);
		System.out.println(age);
		
		return 0;
	}
	public static void main(String[] args) {
		try {
			getAge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
