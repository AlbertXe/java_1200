package chap05_object.clone;

public class Address implements Cloneable {
	private String nub;

	public String getNub() {
		return nub;
	}

	public void setNub(String nub) {
		this.nub = nub;
	}

	@Override
	protected Address clone() throws CloneNotSupportedException { // 实现浅克隆 ，因为 属性 都是不可变的，不必深度克隆
		Address address ;
		return (Address) super.clone();
	}
	
	
}
