package hw2;


import java.io.*;
import java.net.MalformedURLException;

import javax.swing.*;

public class Something extends JFrame {
		
	Something() throws MalformedURLException{
			JPanel panel = new JPanel();
			File file = new File("images/ua.png");
			ImageIcon image = new ImageIcon(file.toURI().toURL());		
			JLabel label = new JLabel(image);
			JLabel path = new JLabel(file.getAbsolutePath());
			
			setSize(500,500);
			panel.add(label);
			panel.add(path);
			add(panel);
			
			
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
