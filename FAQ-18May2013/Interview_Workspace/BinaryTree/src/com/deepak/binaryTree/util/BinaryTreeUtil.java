/**
 * 
 */
package com.deepak.binaryTree.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

import com.deepak.binaryTree.node.BinaryTreeNode;

/**
 * @author indkumar07
 * @param <T>
 *
 */
public class BinaryTreeUtil<T> {
	
	List<BinaryTreeNode<T>> listNode;
	
	public BinaryTreeUtil() {
		this.listNode = new LinkedList<BinaryTreeNode<T>>();
	}
	
	
	public List<BinaryTreeNode<T>> getListNode() {
		return listNode;
	}


	public void setListNode(List<BinaryTreeNode<T>> listNode) {
		this.listNode = listNode;
	}


	/**
	 * InOrder traversal of Binary Tree
	 * @param root
	 */
	public void inOrder(BinaryTreeNode<T> root){
			
		if(root.getLeft()!= null){
			inOrder(root.getLeft());
		}

		this.listNode.add(root);

		if(root.getRight() != null){
			inOrder(root.getRight());
		}
	}
	
	/**
	 * preOrder traversal of Binary Tree
	 * @param root
	 */
	public void preOrder(BinaryTreeNode<T> root){
		
		this.listNode.add(root);
		
		if(root.getLeft()!= null){
			preOrder(root.getLeft());
		}

		if(root.getRight() != null){
			preOrder(root.getRight());
		}
	}
	
	/**
	 * postOrder traversal of Binary Tree
	 * @param root
	 */
	public void postOrder(BinaryTreeNode<T> root){
		
		if(root.getLeft()!= null){
			postOrder(root.getLeft());
		}

		if(root.getRight() != null){
			postOrder(root.getRight());
		}
		
		this.listNode.add(root);
		
	}
	
	
	public List<BinaryTreeNode<T>> nonRecursiveInorder(BinaryTreeNode<T> root){
		BinaryTreeNode<T> temp = root;
		this.listNode.clear();
		
		Stack<BinaryTreeNode<T>> st = new Stack<BinaryTreeNode<T>>();
		
		while(true){
			while(temp != null){
				st.push(temp);
				temp = temp.getLeft();
			}
			
			if(st.isEmpty()){
				break;
			}
			
			temp = st.pop();
			this.listNode.add(temp);
			temp = temp.getRight();
		}
		return this.listNode;
	}

	public List<BinaryTreeNode<T>> nonRecursivePreOrder(BinaryTreeNode<T> root){
		this.listNode.clear();

		BinaryTreeNode<T> temp = root;
		Stack<BinaryTreeNode<T>> st = new Stack<BinaryTreeNode<T>>();
		
		while(true){
			while(temp != null){
				this.listNode.add(temp);
				st.push(temp);
				temp = temp.getLeft();
			}
			if(st.isEmpty()){
				break;
			}
			
			temp = st.pop();
			temp = temp.getRight();
		}
		return this.listNode;
	}
	
	
	public List<BinaryTreeNode<T>> nonRecursivePostOrder(BinaryTreeNode<T> root){
		
		BinaryTreeNode<T> temp = root;
		Stack<BinaryTreeNode<T>> st = new Stack<BinaryTreeNode<T>>();
		this.listNode.clear();
		while(true){
			if(temp != null){
				st.push(temp);
				temp = temp.getLeft();
			}else{
				if(st.isEmpty()){
					return this.listNode;
				}else{
					if(st.peek().getRight() == null){
						temp = st.pop();
						this.listNode.add(temp);
						
						while( temp == st.peek().getRight()){
							temp = st.pop();
							this.listNode.add(temp);
							if(st.isEmpty()){
								return this.listNode;
							}
						}
					}
					
					if(!st.isEmpty()){
						temp= st.peek().getRight();
					}else{
						temp = null;
					}
				}
			}
		}
	}
	
	
	public List<BinaryTreeNode<T>> levelOrder(BinaryTreeNode<T> root){
		Queue<BinaryTreeNode<T>> queue = new LinkedBlockingQueue<BinaryTreeNode<T>>();
		BinaryTreeNode<T> temp = root;
		queue.add(temp);
		this.listNode.clear();
		while(!queue.isEmpty()){
			temp = queue.remove();
			this.listNode.add(temp);
			
			
			if(temp.getLeft()!=null){
				queue.add(temp.getLeft());
			}
			
			if(temp.getRight() != null){
				queue.add(temp.getRight());
			}
		}
		
		return this.listNode;
	}
	
	public int findingNoOfNode(BinaryTreeNode<T> root){
		
		if(root == null){
			return 0;
		}
		BinaryTreeNode<T> temp = root;
		int height = 1;
		Queue<BinaryTreeNode<T>> queue = new LinkedBlockingQueue<BinaryTreeNode<T>>();
		queue.add(temp);
		
		while(!queue.isEmpty()){
			temp = queue.remove();
			
			if(temp.getLeft() != null){
				height++;
				queue.add(temp.getLeft());
			}
			
			if(temp.getRight() != null){
				height++;
				queue.add(temp.getRight());
			}
			
		}
		
		return height;
	}
	
	public int heigtOfBinaryTree(BinaryTreeNode<T> root){
		
		if(root == null){
			return -1;
		}
		int left = heigtOfBinaryTree(root.getLeft());
		int right = heigtOfBinaryTree(root.getRight());
		

		if(left > right)
			return  left +1;
		else
			return  right + 1;
		
	}
	
	/**
	 * height using two queues.
	 * @param root
	 * @return
	 */
	public int heightOfBinaryTreeNR(BinaryTreeNode<T> root){
		int height = -1;
		BinaryTreeNode<T> temp = root;
		
		if(root == null){
			return height;
		}
		Queue<BinaryTreeNode<T>> queueCurrentLevel = new LinkedList<BinaryTreeNode<T>>();
		Queue<BinaryTreeNode<T>> queueNextLevel = new LinkedList<BinaryTreeNode<T>>();
		queueCurrentLevel.add(temp);
		
		while(!queueCurrentLevel.isEmpty()){
			temp = queueCurrentLevel.poll();
			
			if(temp.getLeft() != null){
				queueNextLevel.add(temp.getLeft());
			}
			if(temp.getRight() != null){
				queueNextLevel.add(temp.getRight());
			}
			
			if(queueCurrentLevel.isEmpty()){
				height++;
				queueCurrentLevel = new LinkedList<BinaryTreeNode<T>>(queueNextLevel);
				queueNextLevel.clear();
			}
		}
		return height;
	}
	
	/**
	 * With one queue
	 * @param root
	 * @return
	 */
	public int heightOfBinaryTreeNROneQueue(BinaryTreeNode<T> root){
		int height = -1;
		BinaryTreeNode<T> temp = root;
		
		if(root == null){
			return height;
		}
		Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
		queue.add(temp);
		int currentLevel = 1;
		int nextLevel = 0;
		
		while(!queue.isEmpty()){
			temp = queue.poll();
			currentLevel--;
			
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
				nextLevel++;
			}
			if(temp.getRight() != null){
				queue.add(temp.getRight());
				nextLevel++;
			}
			
			if(currentLevel == 0){
				height++;
				currentLevel = nextLevel;
				nextLevel = 0;
			}
		}
		return height;
	}
	
	public List<BinaryTreeNode<T>> printZigZag(BinaryTreeNode<T> root, int size){
		
		List<BinaryTreeNode<T>> zigzagList = new LinkedList<BinaryTreeNode<T>>();
		if(root == null){
			return zigzagList;
		}
		
		int level = 1;
		BinaryTreeNode<T> tempRoot = root;
		zigzagList.add(tempRoot);
		
		Stack<BinaryTreeNode<T>> stackEven = new Stack<BinaryTreeNode<T>>();
		Stack<BinaryTreeNode<T>> stackOdd = new Stack<BinaryTreeNode<T>>();
		stackEven.add(tempRoot);
		
		//while(level != getLevel(size)){
		while(level <= size){
			if((level % 2) == 1){
				while(!stackEven.empty()){
					tempRoot = stackEven.pop();
					
					if(tempRoot.getLeft() != null){
						zigzagList.add(tempRoot.getLeft());
						stackOdd.push(tempRoot.getLeft());
					}
					if(tempRoot.getRight() != null){
						zigzagList.add(tempRoot.getRight());
						stackOdd.push(tempRoot.getRight());
					}
					
					
				}
				level++;
				
			}if((level %2) == 0){
				
				while(!stackOdd.empty()){
					tempRoot = stackOdd.pop();
					
					if(tempRoot.getRight() != null){
						zigzagList.add(tempRoot.getRight());
						stackEven.push(tempRoot.getRight());
					}
					if(tempRoot.getLeft() != null){
						zigzagList.add(tempRoot.getLeft());
						stackEven.push(tempRoot.getLeft());
					}
					
				}
				level++;
			}
		}
		
		
		return zigzagList;
	}
	
	public int getLevel(int size){
		int level = 0;
		
		while(size > 1){
			size = size/2;
			level++;
		}
		
		return level;
	}
	
	public boolean isMirror(BinaryTreeNode<T> root){

		if(root == null){
			return true;
		}else if((root.getLeft() != null && root.getRight() == null) || (root.getLeft() == null && root.getRight() != null)){
			return false;
		}
		
		return (isMirror(root.getLeft()) && isMirror(root.getRight()));
		/*boolean isLeft = false;
		boolean isRight = false;
		if((root.getLeft() != null && root.getRight() != null)){
			if(root.getLeft() != null){
				isLeft = isMirror(root.getLeft());
			}
			
			if(root.getRight() != null){
				isRight = isMirror(root.getRight());
			}
			
			if(isLeft && isRight){
				return true;
			}
		}else if (root.getLeft() == null && root.getRight() == null){
			return true;
		}
		
		return false;*/
	}
}
