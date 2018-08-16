package chap05_object.clone;

import java.io.Serializable;

/**
 * 
 * @ClassName:  Seri_Address   
 * @Description:序列化克隆 
 * @author: 谢洪伟 
 * @date:   2018年8月15日 上午10:50:38   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class Seri_Address implements Serializable {
	private String nub;

	public String getNub() {
		return nub;
	}

	public void setNub(String nub) {
		this.nub = nub;
	}
	
	
}
