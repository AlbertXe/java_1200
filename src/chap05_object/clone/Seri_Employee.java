package chap05_object.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 
 * @ClassName:  Seri_Employee   
 * @Description:序列化克隆   可以使用 transient关键字 修饰 不需要序列化对象
 * @author: 谢洪伟 
 * @date:   2018年8月15日 上午10:53:33   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Seri_Employee implements Cloneable , Serializable {
	private String name;
	private int age;
	private Seri_Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Seri_Address getAddress() {
		return address;
	}
	public void setAddress(Seri_Address address) {
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee=null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);	// 将对象写入到字节数组
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());//从字节数组读取对象
		try {
			ObjectInputStream ois = new ObjectInputStream(bais);
			employee = (Employee) ois.readObject();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return employee;
	}
	
	
	
}
