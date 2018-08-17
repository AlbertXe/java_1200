package chap08_enum;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

/**
 * 
 * @ClassName:  FileMerge   
 * @Description:文件合并 
 * @author: 谢洪伟 
 * @date:   2018年8月17日 上午10:39:43   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FileMerge {
	private Collection<InputStream>  files = new ArrayList<>();
	
	public void merge(){
		SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(files));//将集合按枚举 然后合并
		BufferedInputStream bis = new BufferedInputStream(sis);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./file.txt");
			int len = 0;
			while((len = bis.read())!=-1){
				fos.write(len);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
	}
}
