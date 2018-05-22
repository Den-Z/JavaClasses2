package l3;

import java.io.*;

public class Mm {

	public static void main(String[] args) {
		File file = new File("C:/");
		File[] files = file.listFiles();
		for(File f:files) {
			if(f.isDirectory()) {
				System.out.println(f);
			}
		}
		//String[] f = file.list();
		System.out.println("------------");
		for(File ff:files) {
			if(ff.isFile()) {
				System.out.println(ff);
			}
		}

	}

}
