package hw2;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		File file = new File("C:/");	
		TreeSet<File> ts = new TreeSet<File>((a,b)-> {
			if(a.isDirectory() && b.isDirectory()) {
				return 5;
			} else if(a.isFile() && b.isFile()){
				return -2;
			} else {
				return 1;
			}
		});
//		TreeSet<File> dir = new TreeSet<File>((a,b)->(a.isDirectory()?1:0));
//		TreeSet<String> list = new TreeSet<String>();
		for(File smth:file.listFiles()) {
			ts.add(smth);
//			dir.add(smth);
		}
//		for(File smth:dir) {
//			System.out.println(smth);
//		}
		for(File smth:ts) {
			System.out.println(smth);
		}

	
		
		
	}

}
