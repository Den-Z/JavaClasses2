package adv03;

import java.io.File;

public class Mm {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Java base");
		File[] files=file.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				System.out.println(f);
			}
		}
		System.out.println("--------");
		for(File f:files){
			if(f.isFile()){
				System.out.println(f);
			}
		}
//		String[] f=file.list();
//		for(String ff:f){
//			System.out.println(ff);
//		}

	}

}
