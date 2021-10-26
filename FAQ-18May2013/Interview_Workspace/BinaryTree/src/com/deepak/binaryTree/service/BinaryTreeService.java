/**
 * 
 */
package com.deepak.binaryTree.service;

import java.util.List;

import com.deepak.binaryTree.node.BinaryTreeNode;

/**
 * @author indkumar07
 * @param <T>
 *
 */
public class BinaryTreeService<T> {
	
	BinaryTreeNode<T> root;
	int size;
	
	public BinaryTreeService() {
		this.root = null;
		this.size = 0;
	}
	
	public BinaryTreeService(BinaryTreeNode<T> root) {
		this.root = root;
		this.size = 1;
	}

	public BinaryTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Insert a value
	 * @param value
	 */
	public void insertValue(T value){
		insertNode(new BinaryTreeNode<T>(value, "$"));
	}
	
	
	/**
	 * Insert a node
	 * @param node
	 */
	public void insertNode(BinaryTreeNode<T> node){
		
		//in case root is null;
		if(this.root == null){
			this.root=node;
			this.size++;
			return;
		}
		
		BinaryTreeNode<T> tempRoot = this.root;
		
		while(tempRoot!=null){
			if(node.compareTo(tempRoot) < 0){
				if(tempRoot.getLeft() != null){
					tempRoot = tempRoot.getLeft();
				}else{
					break;
				}
			}else{
				if(tempRoot.getRight() != null){
					tempRoot = tempRoot.getRight();
				}else{
					break;
				}
			}
		}
		if(node.compareTo(tempRoot) < 0){
			tempRoot.setLeft(node);
		}else{
			tempRoot.setRight(node);
		}
		this.size++;
	}
	
	/**
	 * Insert List of Nodes
	 * @param listNode
	 */
	public void insertNodeList(List<BinaryTreeNode<T>> listNode){

		for(BinaryTreeNode<T> node : listNode){
			insertNode(node);
		}
	}
	
	/**
	 * Insert list of values
	 * @param listValue
	 */
	public void insertValueList(List<T> listValue){
		
		for(T value : listValue){
			insertValue(value);
		}
	}
	
}
