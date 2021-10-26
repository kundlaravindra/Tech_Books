/**
 * 
 */
package com.deepak.trieDS.service;

import java.util.ArrayList;
import java.util.List;

import com.deepak.trieDS.node.TrieNode;

/**
 * @author kumadeep
 *
 */
public class TrieService {

	TrieNode root;
	
	public TrieService() {
		this.root  = new TrieNode();
	}
	
	/**
	 * Add word in TRIE
	 * 
	 * @param word
	 */
	public void addWord(String word){
		System.out.println("Adding word in Trie : " + word);
		word = word.toLowerCase();
		TrieNode tempRoot = this.root;
		
		for(int i =0 ; i< word.length() ; i++){
			
			TrieNode[] temp = tempRoot.getTrieNodes();
			if( temp[word.charAt(i)-'a'] == null){
				temp[word.charAt(i)-'a'] = new TrieNode(word.charAt(i),word.substring(0, i+1));
				tempRoot.setTrieNodes(temp);
			}
			tempRoot = temp[word.charAt(i)-'a'];
			
		}
		tempRoot.setWord(true);
		System.out.println(this.root);
	}
	
	
	/**
	 * Search for a word in TRIE
	 * @param word
	 * @return
	 */
	public boolean searchWord(String word){
		System.out.println("Searching word : " + word);
		word = word.toLowerCase();
		TrieNode tempRoot = this.root;
		
		for(int i=0; i< word.length() ; i++){
			
			TrieNode[] temp = tempRoot.getTrieNodes();
			if(temp[word.charAt(i) - 'a'] == null){
				return false;
			}else{
				tempRoot = temp[word.charAt(i) - 'a'];
			}
		}
		if(tempRoot.isWord()){
			System.out.println(tempRoot);
			return true;
		}
		return false;
	}

	
	public List<String> getWordStartingWith(String word){
		List<String> listStr = new ArrayList<String>();

		word = word.toLowerCase();
		TrieNode tempRoot = this.root;
		for(int i = 0; i< word.length() ; i++){
			TrieNode[] temp = tempRoot.getTrieNodes();
			
			if(temp[word.charAt(i) - 'a'] == null ){
				return null;
			}else{
				tempRoot = temp[word.charAt(i) - 'a'];
			}
		}
		listStr = getAllWords( tempRoot, new ArrayList<String>());
		
		return listStr;
	}
	
	/**
	 * Fetch all words from Trie
	 * @param node
	 * @param listWord
	 * @return
	 */
	public List<String> getAllWords(TrieNode node, List<String> listWord){

		TrieNode[] temp = node.getTrieNodes();
		for(int i = 0; i <26 ; i++){
			
			if(temp[i] != null){
				if(temp[i].isWord()){
					listWord.add(temp[i].getValue());
					listWord = getAllWords( temp[i], listWord);
				}else{
					listWord = getAllWords( temp[i], listWord);
				}
			}
		}
		
		return listWord;
	}
	public TrieNode getRoot() { 
		return root;
	}

	public void setRoot(TrieNode root) {
		this.root = root;
	}
	
	
	@Override
	public String toString() {
		return this.root.toString();
	}
}
