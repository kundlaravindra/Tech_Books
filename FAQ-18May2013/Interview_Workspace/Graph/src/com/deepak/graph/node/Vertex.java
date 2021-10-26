/**
 * 
 */
package com.deepak.graph.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author indkumar07
 * @param <T>
 *
 */
public class Vertex<T> implements Comparable<Vertex<T>>{

	T data;
	String label;
	boolean isVisited;
	List<Edge<T>> incomingEdges;
	List<Edge<T>> outgoingEdges;
	
	public Vertex() {
		this.data = null;
		this.label="$";
		this.isVisited=false;
		this.incomingEdges = new ArrayList<Edge<T>>();
		this.outgoingEdges = new ArrayList<Edge<T>>();
	}
	
	public Vertex(T data) {
		this.data = data;
		this.label="$";
		this.isVisited=false;
		this.incomingEdges = new ArrayList<Edge<T>>();
		this.outgoingEdges = new ArrayList<Edge<T>>();
	}
	
	public Vertex(T data, String label) {
		this.data = data;
		this.label="$";
		this.isVisited=false;
		this.incomingEdges = new ArrayList<Edge<T>>();
		this.outgoingEdges = new ArrayList<Edge<T>>();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public List<Edge<T>> getIncomingEdges() {
		return incomingEdges;
	}

	public void setIncomingEdges(List<Edge<T>> incomingEdges) {
		this.incomingEdges = incomingEdges;
	}

	public List<Edge<T>> getOutgoingEdges() {
		return outgoingEdges;
	}

	public void setOutgoingEdges(List<Edge<T>> outgoingEdges) {
		this.outgoingEdges = outgoingEdges;
	}

	@Override
	public int compareTo(Vertex<T> o) {

		if(o.data instanceof Integer && this.data instanceof Integer){
			if(Integer.valueOf(this.data.toString()) < Integer.valueOf(o.data.toString())){
				return 1;
			}else if(Integer.valueOf(this.data.toString()) < Integer.valueOf(o.data.toString())){
				return -1;
			}else{
				return 0;
			}
		}else if(o.data instanceof String && this.data instanceof String){
			return String.valueOf(this.data).compareTo(String.valueOf(o.data));
		}
		
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		@SuppressWarnings("unchecked")
		Vertex<T> that = (Vertex<T>) obj;
		
		if(this.label.equals(that.label) && this.data.equals(that.data)){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.label + " : " + this.data.toString();
	}
	
}
