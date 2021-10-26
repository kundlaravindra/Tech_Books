/**
 * 
 */
package com.deepak.graph.util;

import java.util.LinkedList;
import java.util.Queue;

import com.deepak.graph.node.Edge;
import com.deepak.graph.node.Vertex;
import com.deepak.graph.service.GraphService;

/**
 * @author indkumar07
 *
 */
public class GraphUtils<T>{

	GraphService<T> graphService = null;
	
	public GraphUtils(GraphService<T> graph) {
		this.graphService = graph;
	}

	public GraphService<T> getGraphService() {
		return graphService;
	}

	public void setGraphService(GraphService<T> graphService) {
		this.graphService = graphService;
	}
	

	public boolean breadthFirstSearch(Vertex<T> vertex){
		
		if(vertex == null){
			return false;
		}
		
		Vertex<T> tempRoot = this.graphService.getRoot();
		Queue<Vertex<T>> queue = new LinkedList<Vertex<T>>();
		queue.add(tempRoot);
		if(tempRoot != null){
			while(!queue.isEmpty()){
				tempRoot = queue.poll();
				
				if(tempRoot.equals(vertex)){
					return true;
				}
				for(Edge<T> edge : tempRoot.getOutgoingEdges()){
					if(!edge.getTo().isVisited()){
						queue.add(edge.getTo());
					}
				}
			}
		}
		return false;
	}
	
	
	public boolean depthFirstSearch(Vertex<T> vertex){
		
		return false;
	}
	
	public boolean dijkstra(Vertex<T> vertex){
		
		return false;
	}
}
