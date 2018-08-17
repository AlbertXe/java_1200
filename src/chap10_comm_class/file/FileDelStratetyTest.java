package chap10_comm_class.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileDeleteStrategy;

/**
 * 
 * @ClassName:  FileDelStratetyTest   
 * @Description:FIle删除策略 简化 文件删除  
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午3:38:22   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FileDelStratetyTest {
	public static void main(String[] args) {
		File rootFile = new File("e:/test"); // 获得文件
		File[] files = rootFile .listFiles();
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		FileDeleteStrategy strategy = FileDeleteStrategy.NORMAL; //普通策略 失败
		try {
			strategy.delete(rootFile);
			System.out.println("删除成功");
		} catch (IOException e) {
			System.out.println("删除失败");
		}
		
		FileDeleteStrategy force = FileDeleteStrategy.FORCE; //成功删除 这是个单例模式
		try {
			force.delete(rootFile);
			System.out.println("删除成功");
		} catch (IOException e) {
			System.out.println("删除失败");
		}
		

		
	}
}
