/**
 * 
 */
package com.deepak.huffmancoding.util;

import java.util.ArrayList;
import java.util.Arrays;

import com.deepak.huffmancoding.node.Node;

/**
 * @author indkumar07
 *
 */
public class HuffmanCodeUtil {

	public static ArrayList<Node<Integer>> getNodes(String paragraph){
		
		ArrayList<Node<Integer>> alNodes = new ArrayList<Node<Integer>>();
		
		Integer[] charFrequency = new Integer[94];
		Arrays.fill(charFrequency, 0);
		
		char[] ch = paragraph.toCharArray();
		
		for(int i=0; i< ch.length ; i++){
			charFrequency[ch[i]-32]++;
		}
		
		for(int i=0; i< charFrequency.length ; i++){
			if(charFrequency[i] > 0){
				alNodes.add(new Node<Integer>(charFrequency[i], String.valueOf((char) (i+32))));
			}
		}
		return alNodes;
	}
}
