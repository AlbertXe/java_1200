package chap05_object.sort;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class Employee2 implements Comparable<Employee2> {
	private int id;
	private String name;

	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee2 emp) {
		return new CompareToBuilder().append(id, emp.id).append(name, emp.name).toComparison();// 利用工具类先比较ID
																								// 在比较name
	}

}
