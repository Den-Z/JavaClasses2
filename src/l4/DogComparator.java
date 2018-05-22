package l4;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog>{


	@Override
	public int compare(Dog a, Dog b) {
		// TODO Auto-generated method stub
		if(a.age > b.age) {
			return -1;
		} else {
			return 1;
		}
	}


}
