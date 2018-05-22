package adv03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Hello {

	public static void main(String[] args) {
		File file=new File("hello.html");
		try (FileOutputStream fos=new FileOutputStream(file)){
			String text="NEW text";
			fos.write(text.getBytes());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
