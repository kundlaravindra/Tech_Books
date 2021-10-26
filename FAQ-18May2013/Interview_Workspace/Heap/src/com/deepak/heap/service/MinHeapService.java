/**
 * 
 */
package com.deepak.heap.service;

import java.util.List;

import com.deepak.heap.node.HeapNode;

/**
 * @author indkumar07
 *
 */
public class MinHeapService {

	HeapNode[] heap;
	int position;
	int maxSize;
	
	public MinHeapService(int maxSize) {
		this.heap = new HeapNode[maxSize];
		this.position=0;
		this.maxSize=maxSize;
	}

	
	public void insert(int value){
		HeapNode node = new HeapNode(value);
		
		if(this.position ==0){
			heap[this.position]=node;
			position++;
			return;
		}else if(this.position == this.maxSize){
			System.out.println("Max Size reached");
			return;
		}
		
		heap[this.position] = node;
		suffleHeap(this.position);
		this.position++;
	}
	
	public void insert(List<Integer> listValue){
		for(Integer value : listValue){
			this.insert(value);
		}
	}
	
	private void suffleHeap(int index){
		int parent = (index-1)/2;
		//System.out.println("Index : " + index);
		if(this.heap[parent].getValue() > this.heap[index].getValue()){
			HeapNode temp = this.heap[index];
			this.heap[index]=this.heap[parent];
			this.heap[parent]=temp;
			suffleHeap(parent);
		}
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	@Override
	public String toString() {

		String str= "";
		for(HeapNode node : this.heap){
			if(node != null)
				str = str + node.toString() + " ; ";
		}
		return str;
	}


	public HeapNode[] getHeap() {
		return heap;
	}


	public void setHeap(HeapNode[] heap) {
		this.heap = heap;
	}
	
}
