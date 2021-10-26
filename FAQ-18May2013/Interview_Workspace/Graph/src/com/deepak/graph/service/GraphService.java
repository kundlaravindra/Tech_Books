/**
 * 
 */
package com.deepak.graph.service;

import java.util.ArrayList;
import java.util.List;

import com.deepak.graph.node.Edge;
import com.deepak.graph.node.Vertex;

/**
 * @author indkumar07
 * @param <T>
 *
 */
public class GraphService<T> {
	
	Vertex<T> root;
	List<Vertex<T>> listOfVertex = null;
	List<Edge<T>> listOfEdge = null;
	boolean isDirected;
	
	
	public GraphService() {
		this.root = null;
		this.listOfVertex = new ArrayList<Vertex<T>>();
		this.listOfEdge = new ArrayList<Edge<T>>();
		this.isDirected = false;
	}
	
	public GraphService(boolean isDirected) {
		this.root = null;
		this.listOfVertex = new ArrayList<Vertex<T>>();
		this.listOfEdge = new ArrayList<Edge<T>>();
		this.isDirected = false;
		this.isDirected = isDirected;
	}
	
	public GraphService(Vertex<T> root) {
		this.root = root;
		this.listOfVertex = new ArrayList<Vertex<T>>();
		this.listOfEdge = new ArrayList<Edge<T>>();
		this.listOfVertex.add(root);
		this.isDirected = false;
	}

	public GraphService(Vertex<T> root, boolean isDirected) {
		this.root = root;
		this.listOfVertex = new ArrayList<Vertex<T>>();
		this.listOfEdge = new ArrayList<Edge<T>>();
		this.listOfVertex.add(root);
		this.isDirected = isDirected;
	}
	
	public Vertex<T> getRoot() {
		return root;
	}

	public void setRoot(Vertex<T> root) {
		this.root = root;
	}

	public List<Vertex<T>> getListOfVertex() {
		return listOfVertex;
	}

	public void setListOfVertex(List<Vertex<T>> listOfVertex) {
		this.listOfVertex = listOfVertex;
	}

	public List<Edge<T>> getListOfEdge() {
		return listOfEdge;
	}

	public void setListOfEdge(List<Edge<T>> listOfEdge) {
		this.listOfEdge = listOfEdge;
	}
	
	public boolean isDirected() {
		return isDirected;
	}

	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}

	public void addVertex(Vertex<T> vertex, boolean isDirected){

		if(vertex == null){
			return;
		}
		if(root == null){
			this.root = vertex;
			this.listOfVertex.add(vertex);
			return;
		}
		
		if(!this.listOfVertex.contains(vertex)){
			this.listOfVertex.add(vertex);
			
			// Incoming edges
			for(Edge<T> edge : vertex.getIncomingEdges()){
				
				if(this.listOfEdge.contains(edge)){
					edge.setTo(vertex);
				}else{
					this.listOfEdge.add(edge);
				}
				
			}
			
			//Outgoing Edges
			for(Edge<T> edge : vertex.getOutgoingEdges()){
				
				if(this.listOfEdge.contains(edge)){
					edge.setFrom(vertex);
				}else{
					this.listOfEdge.add(edge);
				}
			}
		}else{
			System.out.println("The vertex already exists in graph : " + vertex);
		}
		
	}
	
	
	public void addEdge(Edge<T> edge){
		if(edge == null){
			return;
		}
		
		if(this.listOfVertex.size() < 2){
			return;
		}
		
		//Checks if edge exists in list
		if(this.listOfEdge.contains(edge)){
			System.out.println("The Edge already exists in graph : " + edge);
		}else{
			this.listOfEdge.add(edge);
			
			if(edge.getTo() != null && !this.listOfVertex.contains(edge.getTo())){
				this.listOfVertex.add(edge.getTo());
			}
			
			if(edge.getFrom() != null && !this.listOfVertex.contains(edge.getFrom())){
				this.listOfVertex.add(edge.getFrom());
			}
		}
		
	}

}
