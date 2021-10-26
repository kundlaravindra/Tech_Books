package com.deepak.he.bt.service;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import com.deepak.he.bt.node.HeBTNode;

public class HeBTService {

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
