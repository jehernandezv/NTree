package views;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Node;

public class JPTreeFiles extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPTreeFiles() {
		this.setBackground(Color.WHITE);
	}
	
	public void printJTree(Node treeN){
		DefaultMutableTreeNode root = searchBreadFirst(treeN);
		JTree treePaint = new JTree(root);
		this.add(treePaint);
		this.revalidate();
	}

	public static DefaultMutableTreeNode searchBreadFirst(Node treeNario) {
		if(treeNario != null){
			DefaultMutableTreeNode father = new DefaultMutableTreeNode(treeNario.getInfo());
			printSonJTree(treeNario, father);
			return father;
		}
		
		return null;
	}
	
	private static void printSonJTree(Node auxRoot, DefaultMutableTreeNode father) {
		if(auxRoot != null && auxRoot.getListSons() != null){
			for (Node  nodeAux : auxRoot.getListSons()) {
				DefaultMutableTreeNode sonAux = new DefaultMutableTreeNode(nodeAux.getInfo());	
				father.add(sonAux);
				printSonJTree(nodeAux, sonAux);
			}
		}
	}
	
	
}
