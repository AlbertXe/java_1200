package file18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
/**
 * 
 * @ClassName:  FileTest01   
 * @Description:键盘内容保存到文本文件   
 * @author: 谢洪伟 
 * @date:   2018年7月25日 下午3:37:52   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class FileTest01 {
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\Administrator.C64-20171130OTM\\Desktop\\a.txt";
		File file=new File(path);
		if (file.exists()) {
			file.createNewFile();
		}
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(isr);
		String result=bf.readLine();
		System.out.println("你输入的是："+result);
		FileWriter fileWriter=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fileWriter);
		bw.write(result);
		bf.close();
		bw.close();
	}
}
