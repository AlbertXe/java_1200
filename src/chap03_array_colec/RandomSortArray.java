package chap03_array_colec;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

/**
 * 
 * @ClassName:  RandomSortArray   
 * @Description:生成不同随机数 然后排序 
 * @author: 谢洪伟 
 * @date:   2018年8月14日 上午9:36:22   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class RandomSortArray {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();//这个set就是排序的  且不会重复
		Random r =new Random();
		int count=0;
		while (count < 10) {
			boolean success = set.add(r.nextInt(100));
			if (success) {
				count ++;
			}
		}
		Integer[] array =new Integer[set.size()];
		set.toArray(array);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}
		
		
	}
}
