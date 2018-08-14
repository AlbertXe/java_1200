package java_1200;

public class Transer implements Runnable{
	private Bank bank;
	
	public   Transer(Bank bank) {
		this.bank=bank;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			bank.depsite(10);
			//System.out.println("账户余额："+bank.getAccount());
		}
	}
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		java.lang.Thread thread=new java.lang.Thread(new Transer(bank));
		thread.start();
		
	}
	
	
}
