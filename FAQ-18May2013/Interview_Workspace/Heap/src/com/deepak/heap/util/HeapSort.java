/**
 * 
 */
package com.deepak.heap.util;

import java.util.LinkedList;
import java.util.List;

import com.deepak.heap.node.HeapNode;
import com.deepak.heap.service.MaxHeapService;
import com.deepak.heap.service.MinHeapService;

/**
 * @author indkumar07
 *
 */
public class HeapSort {

	MaxHeapService maxHeapService;
	MinHeapService minHeapService;
	
	public HeapSort(int maxSize) {
		this.maxHeapService = new MaxHeapService(maxSize);
		this.minHeapService = new MinHeapService(maxSize);
	}
	
	public List<Integer> heapSort(List<Integer> listValue){
		
		List<Integer> sortedList = new LinkedList<Integer>();
		int length = listValue.size();
		for(int i=0;i < length-1;i++){
			
			MaxHeapService mx = new MaxHeapService(listValue.size());
			mx.insert(listValue);
			sortedList.add(mx.getHeap()[0].getValue());
			
			HeapNode[] tempHeapArray = mx.getHeap();
			tempHeapArray[0] = tempHeapArray[listValue.size()-1];
			
			listValue = getHeapValueList(tempHeapArray, listValue.size()-1);
			
			if(listValue.size()==1){
				sortedList.add(listValue.get(0));
			}
			
		}
		
		
		System.out.println(sortedList);
		
		return sortedList;
	}
	
	
	public List<Integer> getHeapValueList(HeapNode[] node,int end){
			
			List<Integer> listValue = new LinkedList<Integer>();
			
			for(int i=0;i <end; i++){
				listValue.add(node[i].getValue());
			}
			
			return listValue;
		}
}
