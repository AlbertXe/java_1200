package chap08_enum;

import java.util.EnumSet;

/**
 * 
 * @ClassName:  EnumSetTest   
 * @Description:高效的 枚举集合 
 * @author: 谢洪伟 
 * @date:   2018年8月17日 上午10:00:47   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class EnumSetTest {
	public static void main(String[] args) {
		EnumSet<Weeks> weeks = EnumSet.noneOf(Weeks.class);// 空的 指定类型 集合
		weeks.add(Weeks.MONDAY);
		System.out.println(weeks);
		weeks.remove(Weeks.MONDAY);
		System.out.println(weeks);
		weeks.addAll(EnumSet.complementOf(weeks));//增加 weeks 的补集
		System.out.println(weeks);
		weeks.removeAll(EnumSet.range(Weeks.MONDAY, Weeks.THURSDAY));
		System.out.println(weeks);
	}
	
}

 enum Weeks{
	 MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURADAY,SUNDAY;
}