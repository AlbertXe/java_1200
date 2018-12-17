package chap17_file;

import java.io.File;

/**
 * 
 * @ClassName:  FileUtils   
 * @Description:查找目录下所有文件名
 * @author: 谢洪伟 
 * @date:   2018年12月7日 上午10:10:48
 */
public class FileUtils {
	
	public static void  findFiles(File f){
		findFile(f, 0);
	}
	
	private static void findFile(File f,int level){
		if (f.isDirectory()) {// 目录
			level++;
			File[] files = f.listFiles();
			for (File file: files){
				findFile(file, level);
			}
		}else {
			for (int i = 0; i < level; i++) {
				System.out.print("\t");
			}
			System.out.println(f.getName());
		}
	}
	
	public static void main(String[] args) {
		findFiles(new File("E:/我的坚果云"));
	}
}
