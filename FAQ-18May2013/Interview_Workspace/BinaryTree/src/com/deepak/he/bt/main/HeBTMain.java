package com.deepak.he.bt.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deepak.he.bt.node.HeBTNode;
import com.deepak.he.bt.service.HeBTService;

public class HeBTMain {
	static int min = Integer.MAX_VALUE;
	static List<HeBTNode> listMinBtNode = new ArrayList<HeBTNode>();
	
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int noOfJunction = in.nextInt();
		int noOfQueues = in.nextInt();
		int[][] queues = new int[noOfJunction][4];
		
		for (int i = 0; i < noOfQueues; i++) {
			queues[i][0] = in.nextInt();
			queues[i][1] = in.nextInt();
			queues[i][2] = in.nextInt();
		}
		int root = 7;
		HeBTNode n7 = new HeBTNode(7);
		
		HeBTService bt = new HeBTService(n7);
		makeTree(root, bt, queues, noOfJunction);
		
		System.out.println(bt.root.toString());
		getPath(bt);
		
		
		
	}
	
	private static void makeTree(int root,HeBTService bt,int[][] queues,int noOfJunction){
		
		for (int i = 0; i < noOfJunction; i++) {
			if(queues[i][1] == root){
				bt.addNode(queues[i][0], queues[i][1], queues[i][2]);
				makeTree(queues[i][0], bt, queues, noOfJunction);
			}
		}
	}
	
	private static void getPath(HeBTService bt){
		
		//List<HeBTNode> listMinBtNodes = new ArrayList<HeBTNode>();
		getMinPath(bt.root, new ArrayList<HeBTNode>(), 0);
		
		int time = 0;
		for (int i = listMinBtNode.size()-1; i > 0; i--) {
			time =  2*(listMinBtNode.get(i).getCount() + time) + 1 ;
		}
		System.out.println(time);
		for (int i = listMinBtNode.size()-1; i >= 0; i--) {
			if(i==0){
				System.out.print(listMinBtNode.get(i).getName());
			}else{
				System.out.print(listMinBtNode.get(i).getName() + " --> ");
			}
		}
		
		
		
		//return listMinBtNodes;
	}
	
	private static void getMinPath(HeBTNode root, List<HeBTNode> listMinNodes, int sum){
		HeBTNode temp = root;
		if(temp == null){
			return;
		}
		listMinNodes.add(temp);
		//sum = sum + temp.getCount();
		if(temp.left == null && temp.right == null){
			if(sum+temp.getCount() < min){
				min = sum+temp.getCount();
				listMinBtNode.clear();
				listMinBtNode.addAll(listMinNodes);
				return;
			}
			//listMinNodes.clear();
		}else{
			if(temp.left != null){
				getMinPath(temp.left, listMinNodes, sum + temp.getCount());
				listMinNodes.remove(listMinNodes.size()-1);
				//sum = sum - temp.getCount();
			}
			
			if(temp.right != null){
				getMinPath(temp.right, listMinNodes, sum + temp.getCount());
				listMinNodes.remove(listMinNodes.size()-1);
				//sum = sum - temp.getCount();
			}
		}
	}
	
	
}
