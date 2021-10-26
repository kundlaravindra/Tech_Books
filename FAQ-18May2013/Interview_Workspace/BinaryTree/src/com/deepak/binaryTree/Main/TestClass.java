package com.deepak.binaryTree.Main;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class TestClass {
	
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
		int root = getRoot(queues);
		//System.out.println("Root :" + root);
		HeBTNode n7 = new HeBTNode(root);
		HeBTService bt = new HeBTService(n7);
		makeTree(root, bt, queues, noOfJunction);
		
		//System.out.println(bt.root.toString());
		getPath(bt);
		
		
		
	}
	
	private static int getRoot(int[][] queues){
		int root = -1;
		for (int i = 0; i < queues.length; i++) {
			for (int j = 0; j < queues.length; j++) {
				if(queues[i][1] == queues[j][0]){
					break;
				}
				if(j==queues.length-1){
					return queues[i][1];
				}
			}
			
			
		}
		
		return root;
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
				System.out.print(listMinBtNode.get(i).getName() + " -> ");
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

class HeBTNode {

	int name;
	int count;
	public HeBTNode left;
	public HeBTNode right;
	
	public HeBTNode(int name) {
		this.name = name;
		this.count = 0;
		this.left = null;
		this.right = null;
	}
	
	public HeBTNode(int name, int count) {
		this.name = name;
		this.count = count;
		this.left = null;
		this.right = null;
	}
	

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public HeBTNode getLeft() {
		return left;
	}

	public void setLeft(HeBTNode left) {
		this.left = left;
	}

	public HeBTNode getRight() {
		return right;
	}

	public void setRight(HeBTNode right) {
		this.right = right;
	}
	
	@Override
	public boolean equals(Object obj) {
		HeBTNode node = (HeBTNode) obj;
		return this.name == node.name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.count;
	}
}

//Service class

	class HeBTService {

		public HeBTNode root;
		
		public HeBTService() {
			this.root = null;
		}
		
		public HeBTService(HeBTNode root) {
			this.root = root;
		}
		
		public void addNode(int child,int parent,int count){
			if(this.root == null){
				return;
			}
			Queue<HeBTNode> q = new LinkedBlockingQueue<HeBTNode>();
			HeBTNode temp = this.root;
			q.add(temp);
			while(!q.isEmpty()){
				temp = q.remove();
				if (temp.getName() == parent) {
					if(temp.left == null){
						temp.left = new HeBTNode(child, count);
					}else if(temp.right == null){
						temp.right = new HeBTNode(child, count);
					}
					
				}else{
					if(temp.left != null){
						q.add(temp.left);
					}
					if(temp.right != null){
						q.add(temp.right);
					}
				}
			}
		}
	}