package chap10_comm_class.file;

import java.io.File;

import org.apache.commons.io.filefilter.SizeFileFilter;

/**
 * 
 * @ClassName:  SizeFileFilterTest   
 * @Description:文件过滤器
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午4:30:37   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class SizeFileFilterTest {
		public static void main(String[] args) {
			File  file = new File("e:/test");
			
			String[] list = file.list(new SizeFileFilter(1024*1024));//过滤小于 1M 的文件
			for (String fileName : list) {
				System.out.println(fileName);
			}
			
		}
}
