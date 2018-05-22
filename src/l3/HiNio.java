package l3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HiNio {

	public static void main(String[] args) throws IOException {
//		Path path = Paths.get("something.txt");
//		Path path2 = Paths.get("somethingHello.txt");
//		Files.copy(path, path2);
	
		
//		Path dir = Paths.get("C:/hello");
//		File file = new File(dir.toUri());
//		file.mkdir();
		
		Path dir = Paths.get("C:/Dota2");
		Files.createDirectories(dir);
		String pudge = "Fresh meat";
		dir = Paths.get("C:/Dota2/Hero.xml");
		Files.write(dir, pudge.getBytes());
		System.out.println("OK");
		
		

	}

}
