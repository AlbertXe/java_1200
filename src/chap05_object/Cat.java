package chap05_object;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @ClassName:  Cat   
 * @Description:重写equals 和	hashcode 
 * @author: 谢洪伟 
 * @date:   2018年8月15日 上午9:38:59   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Cat {
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if (getClass()!=obj.getClass()) {
			return false;
		}
		Cat cat= (Cat) obj;
		return new EqualsBuilder().append(name, cat.name).append(age, cat.age).isEquals();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(name).append(age).toHashCode();
	}
	@Override
	public String toString() {// 反射获得 注意 ：由于域是私有，如果有安全管理 则会失败
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	public static void main(String[] args) {
		Cat c1 = new Cat("hong", 2);
		Cat c2 = new Cat("hong", 2);
		System.out.println(c1.equals(c2));
	}
	
	
}
