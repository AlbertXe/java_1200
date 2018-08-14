package chap02_base;

import java.io.PrintStream;
/**
 * 
 * @ClassName:  RedirectOut   
 * @Description:重定向输出到日记 。以后开发会用的着，自己打印日记  
 * @author: 谢洪伟 
 * @date:   2018年8月13日 下午4:42:33   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class RedirectOut {

	public static void main(String[] args) throws Exception {
		PrintStream out = System.out;
		PrintStream ps=new PrintStream("./log.txt");
		System.setOut(ps);
		System.out.println("这个会在日记里");
		System.out.println("保存中");
		System.setOut(out);
		System.out.println("这个在控制台");
		
	}

}
