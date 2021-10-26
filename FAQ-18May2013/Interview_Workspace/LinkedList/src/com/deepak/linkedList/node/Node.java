/**
 * 
 */
package com.deepak.linkedList.node;

/**
 * @author kumadeep
 * @param <T>
 *
 */
public class Node<T> {

	String name;
	T value;
	Node<T> next;
	
	public Node() {
		this.name = null;
		this.value = null;
		this.next = null;
	}
	
	public Node(T value) {
		this.name = null;
		this.value = value;
		this.next = null;
	}
	
	public Node(T value, Node<T> next) {
		this.name = null;
		this.value = value;
		this.next = next;
	}
	
	public Node(String name, T value) {
		this.name = name;
		this.value = value;
		this.next = null;
	}
	
	public Node(String name, T value, Node<T> next) {
		this.name = name;
		this.value = value;
		this.next = next;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.value.toString() ;
	}
}
