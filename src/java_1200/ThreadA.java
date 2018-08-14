package java_1200;

import java.lang.Thread.State;

public class ThreadA {
	public static void main(String[] args) {
		final StringBuilder sb =new StringBuilder();
//		for (int i = 0; i < 10; i++) {
//			sb.append(i);
//		}
//		System.out.println(sb.toString());
		for (int i = 0; i < 10; i++) {
			new java.lang.Thread(){

				public void run() {
					sb.append("javabianch\n");
				}
				
			}.start();
		}
		System.out.println(sb.toString());
		java.lang.Thread thread=new java.lang.Thread();
		State state = thread.getState();
		
		ThreadGroup threadGroup=java.lang.Thread.currentThread().getThreadGroup();
		String name = threadGroup.getName();
		System.out.println(name);
	}
	
}
