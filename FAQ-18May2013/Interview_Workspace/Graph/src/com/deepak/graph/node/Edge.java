/**
 * 
 */
package com.deepak.graph.node;

/**
 * @author indkumar07
 * @param <T>
 *
 */
public class Edge<T>{

	String label;
	float weight;
	Vertex<T> to;
	Vertex<T> from;
	
	public Edge() {
		this.label = null;
		this.weight = 0.0f;
		this.to = null;
		this.from = null;
	}
	
	public Edge(String label) {
		this.label = label;
		this.weight = 0.0f;
		this.to = null;
		this.from = null;
	}
	
	public Edge(String label,float weight) {
		this.label = label;
		this.weight = weight;
		this.to = null;
		this.from = null;
	}
	
	public Edge(String label,Vertex<T> to,Vertex<T> from) {
		this.label = label;
		this.weight = 0.0f;
		this.to = to;
		this.from = from;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Vertex<T> getTo() {
		return to;
	}

	public void setTo(Vertex<T> to) {
		this.to = to;
	}

	public Vertex<T> getFrom() {
		return from;
	}

	public void setFrom(Vertex<T> from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return this.label + " : " + this.weight + " : " + this.to.getLabel() + " : " + this.from.getLabel();
	}
	
	@Override
	public boolean equals(Object obj) {
		@SuppressWarnings("unchecked")
		Edge<T> that = (Edge<T>) obj;
		if(this.weight == that.weight && this.label == that.label){
			return true;
		}
		return false;
	}

}
