package chap10_comm_class;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 
 * @ClassName:  ArrayUtilTest   
 * @Description:数组固定长度  == 用Arrays 和 ArrayUtils操作
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午2:49:39   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class ArrayUtilTest {
	public static void main(String[] args) {
		int[] array0 = new int [5];
		Arrays.fill(array0, 8); //	初始化为8
		
		int[] array1 = ArrayUtils.add(array0, 9);  //末尾加9 
		System.out.println(Arrays.toString(array1));
		
		int[] array2 = ArrayUtils.add(array1, 0,7); // 指定 0 位置加9
		System.out.println(Arrays.toString(array2));
		
		int[] array3 = ArrayUtils.addAll(array1, array2); //合并
		System.out.println(Arrays.toString(array3));
		
	}
}
