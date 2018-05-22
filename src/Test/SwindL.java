package adv03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SwindL {
	JButton b=new JButton();
	JLabel label=new JLabel();
	SwindL(){
		initListeners();
	}
	private void initListeners() {
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("OK");
				
			}});
		
		b.addActionListener((e)->label.setText("OK"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
