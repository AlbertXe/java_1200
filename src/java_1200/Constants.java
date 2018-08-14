package java_1200;

import java.util.HashMap;

public class Constants {
	@SuppressWarnings("unchecked")
	public static HashMap<String, String> map=new HashMap(){
		
		{
			put(BusinessType.BUY.getCode(), "buyService");
			put(BusinessType.SELL.getCode(), "sellService");

		}
		
	};
	
}
