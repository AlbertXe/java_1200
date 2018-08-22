package chap10_comm_class.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * 
 * @ClassName:  IOUtilsTest   
 * @Description:简化 流的 读写
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午4:42:07   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class IOUtilsTest {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));//工厂路径
		System.out.println(System.getProperty("user.home"));
		String path = IOUtilsTest.class.getResource("/").getPath();
		System.out.println(path);
		String absPath = System.getProperty("user.dir")+"/src/chap10_comm_class/file";
		System.out.println(absPath);
		File f = new File(absPath+"/file.txt");
		
		
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
