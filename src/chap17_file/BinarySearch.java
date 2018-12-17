package chap17_file;

import java_1200.star;

/**
 * 
 * @ClassName:  BinarySearch   
 * @Description:二分法查找  递归
 * @author: 谢洪伟 
 * @date:   2018年12月7日 下午1:39:35
 */
public class BinarySearch {
	private static <T extends Comparable<T>> int bianrySearch(T[] t, int start,int end,T key){
		if (start<=end) {
			int mid = start+ (end-start)/2;
			if (key.compareTo(t[mid])==0) {
				return mid;
			}else if (key.compareTo(t[mid])<0) {
				return bianrySearch(t, start, mid-1, key);
			}else {
				return bianrySearch(t,mid+1,end,key);
			}
			
		} 
		return -1;
	}

}