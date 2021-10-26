package com.deepak.he.bt.node;

public class HeBTNode {

	int name;
	int count;
	public HeBTNode left;
	public HeBTNode right;
	
	public HeBTNode(int name) {
		this.name = name;
		this.count = 0;
		this.left = null;
		this.right = null;
	}
	
	public HeBTNode(int name, int count) {
		this.name = name;
		this.count = count;
		this.left = null;
		this.right = null;
	}
	

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public HeBTNode getLeft() {
		return left;
	}

	public void setLeft(HeBTNode left) {
		this.left = left;
	}

	public HeBTNode getRight() {
		return right;
	}

	public void setRight(HeBTNode right) {
		this.right = right;
	}
	
	@Override
	public boolean equals(Object obj) {
		HeBTNode node = (HeBTNode) obj;
		return this.name == node.name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.count;
	}
}
