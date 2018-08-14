package file18;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * 
 * @ClassName:  FileTest02   
 * @Description:将数组写入到文件并且倒序输出 ?为什么乱码
 * @author: 谢洪伟 
 * @date:   2018年7月25日 下午3:38:39   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FileTest02 {
	public static void main(String[] args) throws Exception {
		 int[] b={1,2,3,4,5};
		 String path="C:\\Users\\Administrator.C64-20171130OTM\\Desktop\\a02.txt";
		 File file=new File(path);
		 
		 RandomAccessFile raf=new RandomAccessFile(file, "rw");
		 for (int i = 0; i < b.length; i++) {
			raf.writeInt(b[i]);//将数组写入文件
		}
		 for (int i = b.length-1; i >= 0; i--) {
			System.out.println(b[i]);
			raf.seek(i*4);//int 占据4个字节
			System.out.println(raf.readInt());
		}
		 
		 raf.close();
		 
	}
}	
