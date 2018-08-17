package chap10_comm_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.apache.commons.lang3.SerializationUtils;

/**
 * 
 * @ClassName:  SerializableTest   
 * @Description:序列化工具简化 序列化开发 
 * @author: 谢洪伟 
 * @date:   2018年8月17日 下午3:10:25   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class SerializableTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(10);
		student.setName("明日科技");
		byte[] bs = SerializationUtils.serialize(student);//序列化成数组
		System.out.println(Arrays.toString(bs));
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("./src/chap10_comm_class/stu.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		SerializationUtils.serialize(student,fos);//序列化到文件
		System.out.println("序列化成功");
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(new File("./src/chap10_comm_class/stu.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Student stu = SerializationUtils.deserialize(fis);
		System.out.println(stu);
	}
}
