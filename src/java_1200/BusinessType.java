package java_1200;
/**
 * 
 * @ClassName:  BusinessType   
 * @Description:枚举测试   
 * @author: 谢洪伟 
 * @date:   2018年7月26日 上午10:06:14   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public enum BusinessType {
	BUY("01"),
	SELL("02");
	
	private String code;
	private BusinessType(String code){
		this.code=code;
	}
	public String getCode() {
		return code;
	}
	public static BusinessType getType(String code) {
		BusinessType[] values = BusinessType.values();
		for (BusinessType businessType : values) {
			if (businessType.getCode().equals(code)) {
				return businessType;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(BusinessType.BUY);
		System.out.println(BusinessType.SELL.getCode());
		System.out.println(BusinessType.getType("01"));
	}
}
