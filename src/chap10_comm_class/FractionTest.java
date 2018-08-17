package chap10_comm_class;

import org.apache.commons.lang3.math.Fraction;

/**
 * 
 * @ClassName:  FractionTest   
 * @Description:分数运算  Fraction
 * 				Commons包下还有很多 关于数学方面的计算  正太 线性 等
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午3:23:05   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */

public class FractionTest {
	
	public static void main(String[] args) {
		Fraction f1 = Fraction.getFraction(1, 3);// 1/3
		Fraction f2 = Fraction.getFraction(1,5); // 1/5
		Fraction addtion = f1.add(f2);
		System.out.println(addtion);
		System.out.println(f1.invert());
		
		System.out.println(addtion.floatValue());
		
	}
}
