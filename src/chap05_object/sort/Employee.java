package chap05_object.sort;

import java.util.Arrays;
/**
 * 
 * @ClassName:  Employee   
 * @Description:排序 --利用Arrays.sort()    使用这中排序的对象 必须实现 comparable 接口 
 * @author: 谢洪伟 
 * @date:   2018年8月15日 下午12:37:07   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Employee implements Comparable<Employee>{
	private int id;
	
	
	public Employee(int id) {
		super();
		this.id = id;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}


	public int compareTo(Employee t) {
		if (id>t.id){
			return 1;
		}
		if (id==t.id) {
			return 0;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Employee e1 =new Employee(1);
		Employee e2 =new Employee(2);
		Employee e3 =new Employee(3);
		Employee[] ee =new Employee[]{e2,e1,e3};
		Arrays.sort(ee);
		for (Employee employee : ee) {
			System.out.println(employee.getId());
		}
		
	}



	

}
