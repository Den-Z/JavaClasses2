package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestConsoleFileManager {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String path = "\\";
		File file = new File("C:/");
		SortedSet<File> ts = new TreeSet<File>((a,b)->a.isDirectory()?1:-1);
		for(File smth:file.listFiles()) {	
			if(!smth.isHidden()) {
		ts.add(smth);
		
		}
		}
//	for(int i = 0;i < ts.size();i++) {
//		System.out.println(ts.toString());
//	}
	
	for(int i = 0;i<file.listFiles().length;i++) {
		System.out.println(file.listFiles());
}
	
//		while (true) {
//			
//			file = new File(file.getAbsolutePath() + path);
//			System.out.println(file.getAbsolutePath());
//			
//			for (File item : file.listFiles()) {
//				if (item.isDirectory()) {
//					System.out.println(item.getName() + " --- folder");
//				} else {
//					continue;
//				}
//			}
//			
//			for (File item : file.listFiles()) {
//				if (item.isFile()) {
//					System.out.println(item.getName() + " --- file");
//				} else {
//					continue;
//				}
//
//			}
//			System.out.println("Enter path:");
//			path = "\\" + in.nextLine();
//		}
		}
}
