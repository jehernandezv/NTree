package model;

public class Node {
	private Node father;
	private int info;
	
	
	public Node(Node father, int info) {
		this.father = father;
		this.info = info;
	}


	public Node getFather() {
		return father;
	}


	public void setFather(Node father) {
		this.father = father;
	}


	public int getInfo() {
		return info;
	}


	public void setInfo(int info) {
		this.info = info;
	}
	
	
	
	
	
	
	

}
