package chap07_reflect.dymatic_proxy;

public class Seller1 implements Seller {

	@Override
	public void sell() {
		System.out.println("sell1" + "卖东西");
	}
	

}
