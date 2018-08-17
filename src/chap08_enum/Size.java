package chap08_enum;
/**
 * 
 * @ClassName:  Size   
 * @Description:增加枚举信息 == 方法   
 * @author: 谢洪伟 
 * @date:   2018年8月17日 上午9:57:35   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
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
