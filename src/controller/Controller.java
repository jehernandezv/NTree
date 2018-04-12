package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.JFMainWindow;

public class Controller implements ActionListener{

	private JFMainWindow jfMainWindow;
	
	public Controller() {
		jfMainWindow = new JFMainWindow(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (EAction.valueOf(e.getActionCommand())) {
		case SELECT_FILE:
			System.out.println("entro");
			break;

		default:
			break;
		}
		
	}
	
}


	
