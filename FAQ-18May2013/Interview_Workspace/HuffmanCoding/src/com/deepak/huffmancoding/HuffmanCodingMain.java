/**
 * 
 */
package com.deepak.huffmancoding;

import java.util.ArrayList;
import java.util.Map;

import com.deepak.huffmancoding.node.Node;
import com.deepak.huffmancoding.service.HuffmanCodingService;
import com.deepak.huffmancoding.util.HuffmanCodeUtil;

/**
 * @author indkumar07
 *
 */
public class HuffmanCodingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*Node<Integer>[] node = new Node[6];
		
		node[0] = new Node<Integer>(5,"a");
		node[1] = new Node<Integer>(9,"b");
		node[2] = new Node<Integer>(12,"c");
		node[3] = new Node<Integer>(13,"d");
		node[4] = new Node<Integer>(16,"e");
		node[5] = new Node<Integer>(45,"f");*/
		
		
		String str = "ABBCCCDDDDEEEEEFFFFFFGGGGGGGHHHHHHHHIIIIIIIIIJJJJJJJJJJKKKKKKKKKKKLLLLLLLLLLLL";
		System.out.println(HuffmanCodeUtil.getNodes(str));
		
		ArrayList<Node<Integer>> alNodes =  HuffmanCodeUtil.getNodes(str);
		
		@SuppressWarnings("unchecked")
		Node<Integer>[] nodes = new Node[alNodes.size()];
		
		nodes = alNodes.toArray(nodes);
		
		//Node<Integer>[] nodes = new Node<Integer>
		
		//System.out.println(mapHuffmanCode);
		/*Node<Integer>[] node = new Node[12];
	    node[0] = new Node<Integer>(1,"a");
		node[1] = new Node<Integer>(2,"b");
		node[2] = new Node<Integer>(3,"c");
		node[3] = new Node<Integer>(4,"d");
		node[4] = new Node<Integer>(5,"e");
		node[5] = new Node<Integer>(6,"f");
		node[6] = new Node<Integer>(7,"g");
		node[7] = new Node<Integer>(8,"h");
		node[8] = new Node<Integer>(9,"i");
		node[9] = new Node<Integer>(10,"j");
		node[10] = new Node<Integer>(11,"k");
		node[11] = new Node<Integer>(12,"l");*/
		
		
		//HuffmanCodingService huffmanCodingService = new HuffmanCodingService(node);
		
		//HuffmanTree ht = new HuffmanTree();
		
		//ht.createHuffmanTree(node);
		
		HuffmanCodingService hfcs = new HuffmanCodingService();
		Map<Node<Integer>,String> mapHuffmanCode = hfcs.getHuffmanCode(nodes);
		System.out.println(mapHuffmanCode);
		
	}

}
