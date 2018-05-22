package lesson4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiM {
//способы получения стрима
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<String> listS = new ArrayList<String>();
		listS.add("a");
		listS.add("b");
		listS.add("c");
		Stream<Integer> stream =list.stream();
		Stream<String> streamString = Stream.of("a1","b1","c1","a1","m1");
		IntStream streamFromArray = Arrays.stream(new int[] {});
		IntStream streamFromString = "1234567".chars();
		
		
		
//		long c = streamString.filter("a"::equals).count();
//		System.out.println(c);
		
		System.out.println(streamFromArray.findFirst().orElse(0));
		
		System.out.println(listS.stream().skip(listS.size()-1).findAny().orElse("Empty"));
		
		System.out.println(streamString.filter((s)->s.contains("a")).collect(Collectors.toList()));
		
		
	}

}
