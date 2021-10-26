/**
 * 
 */
package com.deepak.heap.node;

/**
 * @author indkumar07
 *
 */
public class HeapNode {

	int value;
	String label;
	
	public HeapNode() {
		this.value=0;
		this.label = null;
	}
	
	public HeapNode(int value) {
		this.value=value;
		this.label = Integer.toString(value);
	}
	
	public HeapNode(int value, String label) {
		this.value=value;
		this.label=label;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		//return this.label + " : " + this.value;
		return " " + this.value;
	}
}
