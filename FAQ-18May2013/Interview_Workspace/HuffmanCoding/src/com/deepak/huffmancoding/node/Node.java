/**
 * 
 */
package com.deepak.huffmancoding.node;

/**
 * @author indkumar07
 * @param <T>
 *
 */
public class Node<Integer> implements Comparable{

	int value;
	String label;
	boolean isLeaf;
	Node<Integer> left;
	Node<Integer> right;
	boolean isVisited;
	
	public Node() {
		this.value=0;
		this.label = "$";
		this.isLeaf = true;
		this.left = null;
		this.right = null;
		this.isVisited = false;
	}
	
	public Node(int value) {
		this.value=value;
		this.label = "$";
		this.isLeaf = true;
		this.left = null;
		this.right = null;
		this.isVisited = false;
	}
	
	public Node(int value,boolean isFrequency) {
		this.value=value;
		this.label = "$";
		this.isLeaf = isFrequency;
		this.left = null;
		this.right = null;
		this.isVisited = false;
	}
	
	public Node(int value, String label) {
		this.value=value;
		this.label=label;
		this.isLeaf = true;
		this.left = null;
		this.right = null;
		this.isVisited = false;
	}

	public Node(int value, String label,boolean isFrequency) {
		this.value=value;
		this.label=label;
		this.isLeaf = isFrequency;
		this.left = null;
		this.right = null;
		this.isVisited = false;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public boolean isLeaf() {
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Node<Integer> getLeft() {
		return left;
	}

	public void setLeft(Node<Integer> left) {
		this.left = left;
	}

	public Node<Integer> getRight() {
		return right;
	}

	public void setRight(Node<Integer> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return this.label + " : " + this.value;// + " Left : " + this.left + " Right : " + this.right;
		//return " " + this.value;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		@SuppressWarnings("unchecked")
		Node<Integer> that = (Node<Integer>) obj;
		
		return (this.label.equals(that.label) && (this.value == that.value));
	}

	@Override
	public int compareTo(Object o) {
		@SuppressWarnings("unchecked")
		Node<Integer> that = (Node<Integer>) o;
		if(this.value > that.value){
			return 1;
		}else if (this.value < that.value){
			return -1;
		}else {
			return 0;
		}
	}
}
