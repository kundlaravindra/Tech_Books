/**
 * 
 */
package com.deepak.trieDS.node;

/**
 * @author kumadeep
 *
 */
public class TrieNode {
	
	char label;
	
	String value;
	
	boolean isWord;
	
	TrieNode[] trieNodes;
	
	public TrieNode() {
		this.label = '$';
		this.value= "";
		this.isWord = false;
		this.trieNodes = new TrieNode[26];
	}
	
	public TrieNode(char c, String value) {
		this.label = c;
		this.value= value;
		this.isWord = false;
		this.trieNodes = new TrieNode[26];
	}
	
	@Override
	public String toString() {
		return "Label : " + this.label + " ; VALUE : " + this.value + " ; IS_WORD : " + this.isWord ;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isWord() {
		return isWord;
	}

	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}

	public TrieNode[] getTrieNodes() {
		return trieNodes;
	}

	public void setTrieNodes(TrieNode[] trieNodes) {
		this.trieNodes = trieNodes;
	}
	
}
