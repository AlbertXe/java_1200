
package java_1200;

public class Bank {
	
	private int account=100;
	
	public int  depsite(int money) {
		return account+=money;
	}
	
	public  int  getAccount() {
		return account;
	}
}
