/**
 * 
 */
package com.deepak.trieDS.main;

import java.util.ArrayList;

import com.deepak.trieDS.service.TrieService;


/**
 * @author kumadeep
 *
 */
public class TrieMain {

	public static void main(String[] args){
		
		TrieService ts = new TrieService();
		
		ts.addWord("abc");
		ts.addWord("Deepak");
		ts.addWord("Deepakkumar");
		ts.addWord("Deep");
		ts.addWord("abd");
		ts.addWord("Da");
		
		System.out.println("Search " + ts.searchWord("kum"));
		System.out.println(ts.getAllWords(ts.getRoot(), new ArrayList<String>()));
		System.out.println("Starting with D : " + ts.getWordStartingWith("Dee"));
	}
	
	
}
