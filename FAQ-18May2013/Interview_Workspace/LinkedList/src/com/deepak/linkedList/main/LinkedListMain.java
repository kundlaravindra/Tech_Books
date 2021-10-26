/**
 * 
 */
package com.deepak.linkedList.main;

import com.deepak.linkedList.node.Node;
import com.deepak.linkedList.service.LinkedListService;

/**
 * @author kumadeep
 *
 */
public class LinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListService<Integer> list = new LinkedListService<Integer>(new Node<Integer>("Z", 0));
		list.add(new Node<Integer>("A", 1));
		list.add(new Node<Integer>("B", 2));
		list.add(new Node<Integer>("C", 3));
		list.add(new Node<Integer>("D", 4));
		list.add(new Node<Integer>("E", 5));
		System.out.println(list.toString());
	}

}
