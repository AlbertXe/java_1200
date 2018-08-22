package chap17_file;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * @ClassName:  FileFilterTest   
 * @Description: 文件过滤器
 * @author: 谢洪伟 
 * @date:   2018年8月20日 下午1:56:25   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FileFilterTest {

	public void listFiles() {
		File file = new File("");
		file.listFiles(new CustomerFilter());
	}
	
	
	private final class CustomerFilter implements FileFilter{

		@Override
		public boolean accept(File pathname) {
			String extName = ".txt" ;
			if (pathname.getName().endsWith(extName)) {
				return true;
			}
			return false;
		}
		
	}
	
}
