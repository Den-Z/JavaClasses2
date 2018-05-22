package adv03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HiNio {

	public static void main(String[] args) {
		Path path = Paths.get("C:/OpenServer/domains/localhost");
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
/*
		Path pathToCopy = Paths.get("C:\\Users\\Java base\\workspace\\Pudge\\hello.html");
		Path pathCopy = Paths.get("C:\\Users\\Java base\\workspace\\Pudge\\copy_hello.html");
		try {
			Files.copy(pathToCopy, pathCopy);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		Path p = Paths.get("C:\\Users\\Java base\\workspace\\Pudge\\PudgeNewDir");
		
		//File file=new File(p.toUri());
		//file.mkdir();
		
		try {
			Files.createDirectory(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");
		
		
		
		
	}
}
