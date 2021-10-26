/**
 * 
 */
package com.deepak.binaryTree.node;

/**
 * @author indkumar07
 *
 */
public class BinaryTreeNode<T> implements Comparable<BinaryTreeNode<T>>{
	
	T value;
	String label;
	boolean isVisited;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode() {
		 this.value=null;
		 this.label="$";
		 this.isVisited=false;
		 this.left=null;
		 this.right=null;
	}
	
	public BinaryTreeNode(T value) {
		 this.value=value;
		 this.label="$";
		 this.isVisited=false;
		 this.left=null;
		 this.right=null;
	}
	
	public BinaryTreeNode(T value,String label) {
		 this.value=value;
		 this.label=label;
		 this.isVisited=false;
		 this.left=null;
		 this.right=null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return this.label + "-" + this.value.toString();
	}

	@Override
	public int compareTo(BinaryTreeNode<T> o) {
		if(o.value instanceof Integer){
			Integer that = (Integer) o.value;
			if((Integer)this.value > that){
				return 1;
			}else if((Integer)this.value < that){
				return -1;
			}else{
				return 0;
			}
		}else if(o.value instanceof String){
			String that = (String) o.value;
			return this.value.toString().compareTo(that);
		}
		return 0;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		
		BinaryTreeNode<T> node = (BinaryTreeNode<T>) obj;
		if(this.value.toString().equals(node.value.toString()) && this.label.equals(node.label)){
			return true;
		}else{
			return false;
		}
	}
}
