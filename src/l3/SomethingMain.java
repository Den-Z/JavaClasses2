package l3;

import java.io.*;

public class SomethingMain {

	public static void main(String[] args) throws IOException {
		File file = new File("something.txt");
		FileOutputStream fos = new FileOutputStream("something.txt");
		String something = "Something something something";
				fos.write(something.getBytes());
				fos.close();
			

			
	}

}
