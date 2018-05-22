package l3;

public class LambdaMain {

	public static void main(String[] args) {
//		MyInter mi = new MyInter() {
//			@Override
//			public void doSomething() {
//				System.out.println("Hello from Interface");
//			}
//		};
//		mi.doSomething();
//		MyInter miL=()->{System.out.println("Hi");};
//		miL.doSomething();
//MyClass mc = new MyClass(()->System.out.println("???"));
		
		
		MyClass mc = new MyClass(new IntClass());
		mc.ic.doSomething(10, 2);
		
	}

}
