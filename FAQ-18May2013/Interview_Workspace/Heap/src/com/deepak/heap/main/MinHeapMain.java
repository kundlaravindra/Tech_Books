/**
 * 
 */
package com.deepak.heap.main;

import java.util.ArrayList;
import java.util.List;

import com.deepak.heap.service.MaxHeapService;
import com.deepak.heap.util.HeapSort;

/**
 * @author indkumar07
 *
 */
public class MinHeapMain {

	Integer[] heap;;
	int position;
	int maxSize;
	
	public MinHeapMain(int maxSize) {

		this.heap = new Integer[maxSize];
		this.position=0;
		this.maxSize = maxSize;
	}
	
	public static void main(String[] args){
		//MinHeapMain minheap = new MinHeapMain(10);
		//MinHeapService minheap = new MinHeapService(10);
		MaxHeapService minheap = new MaxHeapService(10);
		//System.out.println(minheap.heap);
		minheap.insert(1);
		minheap.insert(3);
		minheap.insert(6);
		minheap.insert(5);
		minheap.insert(9);
		minheap.insert(8);
		//minheap.insert(-2);
	
		List<Integer> listValue = new ArrayList<Integer>();
		
		listValue.add(1);
		listValue.add(3);
		listValue.add(6);
		listValue.add(5);
		listValue.add(9);
		listValue.add(8);
		listValue.add(-2);
		
		//HeapSort hpSort = new HeapSort(8);
		//System.out.println(hpSort.heapSort(listValue));
		
		System.out.println(minheap);
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
/*	public void insert(int value){
	
		if(this.position ==0){
			heap[this.position]=value;
			position++;
			return;
		}else if(this.position == this.maxSize){
			System.out.println("Max Size reached");
			return;
		}
		
		heap[this.position] = value;
		suffleHeap(this.position);
		this.position++;
	}
	
	public void suffleHeap(int index){
		int parent = (index-1)/2;
		System.out.println("Index : " + index);
		if(this.heap[parent] > this.heap[index]){
			int temp = this.heap[index];
			this.heap[index]=this.heap[parent];
			this.heap[parent]=temp;
			suffleHeap(parent);
		}
	}*/
}
