package chap10_comm_class.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.SizeFileComparator;

/**
 * 
 * @ClassName:  FileUtilsTest   
 * @Description:简化 文件 文件夹 的复制  排序
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午3:46:41   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FileUtilsTest {
	public static void main(String[] args) {
		File file = new File("e:/test");
		File file2 = new File("e:/test2");
		
		try {
			FileUtils.copyDirectory(file, file2);// 一个方法 解决问题 很简单
			File[] files = file2.listFiles();
			for (File file3 : files) {
				System.out.println(file3.getAbsolutePath());//文件夹的原始排序输出
			}
			
			Arrays.sort(files, SizeFileComparator.SIZE_REVERSE);//文件夹的倒序排序输出
			for (File file3 : files) {
				System.out.println(file3.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
