package model;

import java.util.ArrayList;

public class Node {
	private Node father;
	private int info;
	private ArrayList<Node> listSons;
	
	
	public Node(Node father, int info) {
		this.father = father;
		this.info = info;
		this.listSons = new ArrayList<Node>();
	}
	
	public void addSon(Node son){
		this.listSons.add(son);
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
