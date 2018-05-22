package lesson4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
	private MyClient() {}

	public static void main(String[] args) {
		SecurityManager manager = new SecurityManager();
		String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry("172.17.13.172");
            MyRemote stub = (MyRemote) registry.lookup("Hello");
            String response = stub.getMessage();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}

}
