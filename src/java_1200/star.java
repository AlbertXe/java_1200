package java_1200;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

import org.omg.CORBA.PUBLIC_MEMBER;

public class star {
	public static void main(String[] args) {
//		
//		PrintStream out = System.out;
//		try {
//			PrintStream ps =new PrintStream("./log.txt");
//			System.setOut(ps);
//			System.out.println("男人 ");
//			
//			System.setOut(out);
//			System.out.println("运行完毕");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
			
	/*	Scanner s = new Scanner(System.in);
		char[] cs = s.nextLine().toCharArray();
		for (char c : cs) {
			c=(char) (c^2000);
		}
		
		System.out.println("加密结果如下");
		System.err.println(new String(cs));
		*/
		
//		int n=-13;
//		System.out.println(n%2);
		
		/*int [][]a=new int [8][];
		for (int i = 0; i < a.length; i++) {
			a[i]=new int[i+1]; //定义每层数据个数。
			for (int j = 0; j <= a[i].length-1; j++) {
				if (i==0||j==0||j==(a[i].length-1)) {
					a[i][j]=1;
				} else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
				System.out.print(a[i][j]);
			}
			System.out.println();
		}*/
		
		/**
		 *1+1/2!+1/3!+..
		 */
//		for (int i = 0; i < 20; i++) {
//			System.out.println(mul(i));
//		}
		System.out.println(mul(3));
		/*
		BigDecimal sum=BigDecimal.ZERO;
		for (int i = 1; i < 20; i++) {
			sum=mul(i).add(sum);
		}
		System.out.println(sum);*/
		
		NumberFormat instance = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String format = instance.format(1234);
		System.out.println(format);
		
		DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
		String format2 = dateInstance.format(new Date());
		System.out.println(format2);
		
		NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance(Locale.CHINA);
		String format3 = currencyInstance.format(12345);
		System.out.println(format3);
		
		DecimalFormat decimalFormat=new DecimalFormat("#0.000");
		System.out.println(decimalFormat.format(234));
		
		String hexString = Integer.toHexString(44);
		System.out.println(hexString);
		System.out.println();
		
		
	}
	static BigDecimal mul(int i){
		if (i==1) {
			return new BigDecimal(1);
		}else{
			return new BigDecimal(i).multiply(mul(i-1));
		}
	}
}	
