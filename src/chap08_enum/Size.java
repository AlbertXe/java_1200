package chap08_enum;

public enum Size {
	SMALL("我是小号披萨"),MEDIUM("我是中号披萨"),LARGE("我是大号披萨");
	private String description;
	private Size(String des){
		this.description=des;
	}
	public String getDescription() {
		return description;
	}
	
	public static void main(String[] args) {
		for (Size string : Size.values()) {
			System.out.println(string.getDescription());
		}
	}
}
