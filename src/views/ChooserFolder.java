package views;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;

public class ChooserFolder {
	
	private JFileChooser chooser;
	private Component component;
	
	public ChooserFolder(Component component ) {
		this.component = component;
		chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
	}
	
	public void showChooser(){
		chooser.showOpenDialog(component);
	}
	
	public File getFile(){
		return chooser.getSelectedFile();
	}
	

}
