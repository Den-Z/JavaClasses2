package l1;

import java.io.*;
import java.util.Scanner;


public class PojoMain {

	public static void main(String[] args) {
		Notebook note = new Notebook("Acer",17.3,35);
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("Notebook.bin"))){
			dos.writeUTF(note.getMark());
			dos.writeDouble(note.getScreen());
			dos.writeInt(note.getKeysNumber());
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream smth = new DataInputStream(new FileInputStream("Notebook.bin"))){
			System.out.println(smth.readUTF());
			System.out.println(smth.readDouble());
			System.out.println(smth.readInt());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}

