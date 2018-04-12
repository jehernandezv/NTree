package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;
import controller.EAction;

public class JPSelectFile extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JButton jButtonSelectFile;
	
	public JPSelectFile(Controller controller) {
		jButtonSelectFile = new JButton("Select File");
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		jButtonSelectFile.setActionCommand(EAction.SELECT_FILE.name());
		jButtonSelectFile.addActionListener(controller);
		this.add(jButtonSelectFile);
		
	}
	
	

}
