package l4;

public class MyTM {

	public static void main(String[] args) {
		Thread thread = new Thread(()->System.out.println("Hello"));
		thread.start();
		System.out.println(Thread.activeCount());
		
	}

}
