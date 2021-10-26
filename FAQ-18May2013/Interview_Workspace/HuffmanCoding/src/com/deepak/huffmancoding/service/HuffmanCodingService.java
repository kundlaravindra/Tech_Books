/**
 * 
 */
package com.deepak.huffmancoding.service;

import java.util.HashMap;
import java.util.Map;

import com.deepak.huffmancoding.node.Node;
import com.deepak.huffmancoding.tree.HuffmanTree;

/**
 * @author indkumar07
 *
 */
public class HuffmanCodingService {
	
	HuffmanTree huffmanTree;
	Map<Node<Integer>,String> mapHuffmanCode;
	
	public HuffmanCodingService() {
		this.huffmanTree = new HuffmanTree();
		this.mapHuffmanCode = new HashMap<Node<Integer>, String>();
	}
	
	public HuffmanCodingService(HuffmanTree huffmanTree) {
		this.huffmanTree = huffmanTree;
		this.mapHuffmanCode = new HashMap<Node<Integer>, String>();
	}

	public HuffmanTree getHuffmanTree() {
		return huffmanTree;
	}

	public void setHuffmanTree(HuffmanTree huffmanTree) {
		this.huffmanTree = huffmanTree;
	}
	
	
	public Map<Node<Integer>,String> getHuffmanCode(Node<Integer>[] node){
		
		this.huffmanTree.createHuffmanTree(node);
		Node<Integer> tempRoot = this.huffmanTree.getRoot();
		
		traverseHuffmanTree(tempRoot,"");
		//System.out.println(this.mapHuffmanCode);
		
		return this.mapHuffmanCode;
		
	}
	

	private String traverseHuffmanTree(Node<Integer> tempRoot,String hCode){
		
		if(tempRoot == null){
			return hCode;
		}

		if(tempRoot.getLeft() != null){
			traverseHuffmanTree(tempRoot.getLeft(), hCode+"0");
		}
		
		if(tempRoot.getRight() != null){
			traverseHuffmanTree(tempRoot.getRight(), hCode+"1");
		}
		if(tempRoot.getLeft() == null && tempRoot.getRight() == null){
			this.mapHuffmanCode.put(tempRoot, hCode);
			return hCode;
		}
		
		return hCode;
			
	}
}
