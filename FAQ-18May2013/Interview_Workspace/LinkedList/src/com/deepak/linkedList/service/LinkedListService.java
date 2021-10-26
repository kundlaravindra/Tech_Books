/**
 * 
 */
package com.deepak.linkedList.service;

import com.deepak.linkedList.node.Node;

/**
 * @author kumadeep
 * @param <T>
 *
 */
public class LinkedListService<T> {

	Node<T> root;
	
	public LinkedListService() {
		this.root = null;
	}
	
	public LinkedListService(Node<T> root) {
		this.root = root;
	}
	
	public void add(Node<T> node){
		if(this.root == null){
			this.root = node;
			return;
		}
		Node<T> temp = this.root;
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(node);
		temp = temp.getNext();
		//this.root = temp;
	}
	
	@Override
	public String toString() {
		Node<T> temp = this.root;
		String str = "";//temp.toString();
		while(temp.getNext()!=null){
			str =str + temp.toString() + " ; ";
			temp = temp.getNext();
		}
		str =str + temp.toString() + " ; ";	
		return str;
	}
}
