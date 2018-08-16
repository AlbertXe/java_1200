package chap05_object.clone;
/**
 * 
 * @ClassName:  Employee   
 * @Description:克隆  深度克隆  基本类型和不可变类型外 ，引用类型全部克隆 
 * @author: 谢洪伟 
 * @date:   2018年8月15日 上午10:43:00   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Employee implements Cloneable {
	private String name;
	private int age;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee employee=null;
		
		 employee = (Employee) super.clone();
		 employee.address=this.address.clone(); //深度克隆  引用属性也要克隆
		 
		return employee;
	}
	
	
	
}
