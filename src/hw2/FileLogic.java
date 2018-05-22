package hw2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class FileLogic {
	File file = new File("C:/");
	File[] folder;

	// Path path=Paths.get("C:/");
	FileLogic() {
		System.out.println(file.getAbsolutePath());
		folder = file.listFiles();
		System.out.println(Arrays.toString(folder));
	}

	public void scanning() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			String getScanned = scan.nextLine();
			String subScanned = getScanned.substring(0, 3);
			if (subScanned.equals("cd ")) {
				File fileChange = new File(getScanned.substring(3));
				if (fileChange.isDirectory()) {
					System.out.println(fileChange.getAbsolutePath());
					String[] folderChange = fileChange.list();
					System.out.println(Arrays.toString(folderChange));
				} else {
					System.out.println("Incorrect path, try again");
				}
			} else {
				System.out.println("<" + getScanned + "> was incorrect command");
			}
			scan.close();
		}
	}

	public void changingDirectory(String s) {
		File fileChange = new File(s);
		if (fileChange.isDirectory()) {
			folder = fileChange.listFiles();
			System.out.println(fileChange.getAbsolutePath());
			String[] folderChange = fileChange.list();
			System.out.println(Arrays.toString(folderChange));
		}
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
