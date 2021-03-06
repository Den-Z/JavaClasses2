package lesson4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyServer implements MyRemote{

	public static void main(String[] args) {
		try {
            MyServer obj = new MyServer();
            MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }

	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
