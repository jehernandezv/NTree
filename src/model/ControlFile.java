package model;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ControlFile {
	
	private Tree tree;
	private ArrayList<File> listSongs;
	private ArrayList<String> listExtension;
	
	
	public ControlFile(String string) {
		this.tree = new Tree();
		tree.setRoot(new Node(string));
//		this.getSongFile(file);
//		this.getExtension(this.listSongs);
//		this.addExtensionTree();
	}
	
	public void getSongFile(File fileSelect){
		File [] listFile = fileSelect.listFiles();
		for (int i = 0; i < listFile.length; i++) {
			if(listFile[i].isDirectory()){
				getSongFile(listFile[i]);
			}else{
				this.listSongs.add(listFile[i]);
			}
		}
	}
	
	
	public void getExtension(ArrayList<File> files){
		for (int i = 0; i < files.size(); i++) {
			this.listExtension.add(getNameFile(files.get(i), (byte) 1));
		}
	}
	
	public void addExtensionTree(){
		for (int i = 0; i < this.listSongs.size(); i++) {
				String extSong = getNameFile(listSongs.get(i), (byte) 1);
				if(!listExtension.contains(extSong)){
					this.tree.add(this.tree.getRoot(), extSong);
			}
		}
	}
	
	public void refactorTree(File fileSelect){
		getSongFile(fileSelect);
		getExtension(this.listSongs);
		addExtensionTree();
		
	}

	public String getNameFile(File file,byte pos){
		String nameFile = file.getName();
		String aux = Pattern.quote(".");
		return nameFile.split(aux)[pos].toString();
	}

	public Tree getTree() {
		return tree;
	}

	public void setTree(Tree tree) {
		this.tree = tree;
	}
	
	

}
