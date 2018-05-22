package hw2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class FileInterface extends JFrame implements ActionListener {
	FileLogic filelogic = new FileLogic();
	JLabel path;
	Boolean b = false;
	FileInterface() {
		super("It will be filemanager,m8");
		// JPanel panel = new JPanel();
		ImageIcon img = new ImageIcon("C:\\Users\\unlu\\eclipse-workspace\\Chess\\images\\BlackKnight.png");
		path = new JLabel(filelogic.file.getAbsolutePath());
		path.setBounds(0, 0, 20, 50);
		add(path);
		setLayout(new GridLayout(0, 1));

		for (int i = 0; i < filelogic.folder.length; i++) {
			JLabel oneFile = new JLabel(filelogic.folder[i].getName());
			oneFile.setBounds(0, 0, 100, 20);
			int j = i;
			oneFile.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent e) {
					//JLabel temp = (JLabel) e.getSource();
					File file = new File(filelogic.folder[j].getPath());
					System.out.println(filelogic.folder[j]);
					System.out.println(file.getAbsolutePath());
					path.setText(file.getAbsolutePath());
					filelogic.changingDirectory(file.getPath());
					getContentPane().removeAll();
					add(path);

					 for (int i = 0; i < filelogic.folder.length; i++) {
					 JLabel oneFile2 = new JLabel(filelogic.folder[i].getName());
					 oneFile.setBounds(0, 0, 100, 20);
					 int j = i;
					 add(oneFile2);
					 validate();

					 }

				}
			});
			add(oneFile);
		}

		setLocationByPlatform(false);
		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
