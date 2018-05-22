package adv03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mu {

	public static void main(String[] args) {
//		ArrayList<String> al=new ArrayList<String>();
//		LinkedList<String> ll=new LinkedList<String>();
//		
//		List<String> list1=al;
//		List<String> list2=ll;
		IntClass ic=new IntClass();
		DoubleClass ac=new DoubleClass();
		MyInt i=new MyInt(){

			@Override
			public void doSomething() {
				System.out.println("MyInt");
				
			}};
		MyClass mc=new MyClass(()->System.out.println("MyInt"));
		
	}

}
