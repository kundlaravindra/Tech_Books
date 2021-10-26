/**
 * 
 */
package com.deepak.immutable;

import java.util.ArrayList;

import com.deepak.demo.Demo;

/**
 * @author kumadeep
 *
 */
public class ImmutableDemo {

	final ArrayList<Integer> al = new ArrayList<Integer>();
	
	public static int i = 0;
	
	protected ImmutableDemo() {
		al.add(100);
		al.add(200);
		al.add(300);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Integer> getAll() {
		return (ArrayList<Integer>) al.clone();
		//return al;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final ImmutableDemo im = new ImmutableDemo();
		ArrayList<Integer> alMain = im.getAll();
		System.out.println(alMain == im.getAll());
		
		
		/*im.al.add(400);
		System.out.println();
		System.out.println(im.getAl());*/

	}

}
