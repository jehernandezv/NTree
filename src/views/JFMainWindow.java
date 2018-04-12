package views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import controller.Controller;

public class JFMainWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPSelectFile jpSeleecFile;
	
	public JFMainWindow(Controller controller) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		getContentPane().setBackground(Color.WHITE);
		this.jpSeleecFile = new JPSelectFile(controller);
		this.setLayout(new BorderLayout());
		this.add(jpSeleecFile,BorderLayout.CENTER);
		this.setVisible(true);
		
	}
	
	public void showChooser(){
	 this.jpSeleecFile.showChooser();
	}
	

}
