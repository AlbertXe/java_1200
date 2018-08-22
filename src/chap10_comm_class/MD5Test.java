package chap10_comm_class;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Test {
	public static void main(String[] args) {
		String md5Hex = DigestUtils.md5Hex("abc");
		System.out.println(md5Hex);
		
	}
}
