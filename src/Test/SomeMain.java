package adv03;

public class SomeMain {

	public static void main(String[] args) {
		SomeFI fi=new SomeFI(){
			@Override
			public void doMethod(int a) {
				System.out.println(a);			
			}};
		
		SomeClass sm=new SomeClass((a)->System.out.println(a));			
			

	}

}
