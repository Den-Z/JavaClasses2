package l4;

import java.util.SortedSet;
import java.util.TreeSet;

public class DogMain {
	public static void main(String[] args) {
		Dog bobik = new Dog("Bobik",5);
		Dog barsik = new Dog("Barsik",3);
		SortedSet<Dog> sort = new TreeSet<Dog>((a,b)->(a.age>b.age?1:-1));
		sort.add(bobik);
		sort.add(barsik);
		
		System.out.println(sort);
	}

}
