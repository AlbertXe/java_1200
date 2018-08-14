package java_1200;

public class JoinThread {
	public static void main(String[] args) {
		java.lang.Thread thread=new java.lang.Thread(new EmergencyThread());
		thread.start();
		for (int i = 0; i < 6; i++) {
			try {
				java.lang.Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("正常第"+i+"出发");
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
