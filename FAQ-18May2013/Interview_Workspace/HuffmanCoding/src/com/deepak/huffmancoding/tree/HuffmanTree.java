/**
 * 
 */
package com.deepak.huffmancoding.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.deepak.huffmancoding.node.Node;

/**
 * @author indkumar07
 *
 */
public class HuffmanTree {

	Node<Integer> root;
	List<Node<Integer>> listOfNodes;
	
	
	public HuffmanTree() {
		this.root = new Node<Integer>();
		listOfNodes = new ArrayList<Node<Integer>>();
	}
	
	public HuffmanTree(Node<Integer> root){
		this.root = root;
		listOfNodes = new ArrayList<Node<Integer>>();
	}
	
	public void ensureCapacity(Node<Integer>[] node){
		int oldCapacity = node.length;
		int newCapacity = oldCapacity + 2;
		node = Arrays.copyOf(node, newCapacity);
		System.out.println("New Capacity : " + node.length);
	}
	
	
	public void createHuffmanTree(Node<Integer>[] node){
		List<Node<Integer>> tempRootList= new ArrayList<Node<Integer>>();
		
			for(int i=0 ; i<node.length ; i++){
				
				//for first node
				if(listOfNodes.isEmpty()){
					Node<Integer> tempRoot = node[i];
					listOfNodes.add(tempRoot);
					tempRootList.add(node[i]);
				}else if(!node[i].isVisited()){
						Node<Integer> temp=null;
						if(i < node.length-1){
							temp = getMinFrequencyCombination(tempRootList, node[i], node[i+1]);
						}else{
							temp = getMinFrequencyCombination(tempRootList, node[i],null);
						}
						Node<Integer> parent=null;
						if(temp.isVisited()){
							parent = new Node<Integer>(temp.getValue()+ node[i].getValue(), "$", false);
						}else{
							parent = temp;
							parent.setVisited(false);
						}
						if(temp.getValue() < node[i].getValue()){
							parent.setLeft(temp);
							parent.setRight(node[i]);
							
						}else{
							parent.setLeft(node[i]);
							parent.setRight(temp);
						}
						parent.setLeaf(false);
						node[i].setVisited(true);
						
						tempRootList.add(parent);
						
				}
				
			}
			
			System.out.println("tempRootList : " + tempRootList );
			if(tempRootList.size() > 1){
				normalize(tempRootList);
				
			}
			this.root = tempRootList.get(0);
			System.out.println(this.root);
	}
	
	private Node<Integer> getMinFrequencyCombination(List<Node<Integer>> tempRootList,Node<Integer> currentNode, Node<Integer> nextNode){
		
		int min = Integer.MAX_VALUE;
		Node<Integer> resultNode = null;
		
		//Checks minimum of current and next node.
		if(nextNode!=null){
				min = currentNode.getValue() + nextNode.getValue();
				nextNode.setVisited(true);
				resultNode = nextNode;
		}else{
			System.out.println("next node is null");
		}
		
		//Checks minimum of current and roots.
		Iterator<Node<Integer>> it= tempRootList.iterator();
		while(it.hasNext()){
			Node<Integer> node = it.next();
			if((currentNode.getValue() + node.getValue()) < min){
				min = currentNode.getValue() + node.getValue();
				resultNode = node;
				node.setVisited(true);
				if(nextNode!=null){
					nextNode.setVisited(false);
				}
			}
		}
		
		
		//checks minimum among root nodes.
		Collections.sort(tempRootList);
		if(tempRootList.size() > 1){
			if((tempRootList.get(0).getValue() + tempRootList.get(1).getValue()) < min){
				
				resultNode.setVisited(false);
				min = tempRootList.get(0).getValue() + tempRootList.get(1).getValue();
				
				resultNode = new Node<Integer>(min);
				resultNode.setLeft(tempRootList.get(0));
				resultNode.setRight(tempRootList.get(1));
				tempRootList.remove(0);
				tempRootList.remove(0);
				if(nextNode!=null){
					nextNode.setVisited(false);
				}
			}
		}
		
		
		if(tempRootList.contains(resultNode) && resultNode.isVisited()){
			tempRootList.remove(resultNode);
		}
		
		resultNode.setVisited(true);
		return resultNode;
	}
	
	
	private void normalize(List<Node<Integer>> listOfRootNodes){
		
		while(listOfRootNodes.size() != 1){
			Collections.sort(listOfRootNodes);
			
			Node<Integer> newEntry = new Node<Integer>(listOfRootNodes.get(0).getValue() + listOfRootNodes.get(1).getValue(),false);
			newEntry.setLeft(listOfRootNodes.get(0));
			newEntry.setRight(listOfRootNodes.get(1));
			
			listOfRootNodes.remove(0);
			listOfRootNodes.remove(0);
			listOfRootNodes.add(newEntry);
			System.out.println("listOfRootNodes : " + listOfRootNodes);
		}
	}
	
	/*private List<Node<Integer>> resetList(List<Node<Integer>> list){
		
		Iterator<Node<Integer>> it = list.iterator();
		
		while(it.hasNext()){
			Node<Integer> node = it.next();
			if(node.isVisited()){
				node.setVisited(false);
			}
		}
		
		return list;
	}*/
	
	public Node<Integer> getRoot() {
		return root;
	}

	public void setRoot(Node<Integer> root) {
		this.root = root;
	}
	
}
