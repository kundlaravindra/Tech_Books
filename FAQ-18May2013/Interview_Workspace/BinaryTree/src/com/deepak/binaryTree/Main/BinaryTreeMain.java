/**
 * 
 */
package com.deepak.binaryTree.Main;

import com.deepak.binaryTree.node.BinaryTreeNode;
import com.deepak.binaryTree.service.BinaryTreeService;
import com.deepak.binaryTree.util.BinaryTreeUtil;

/**
 * @author indkumar07
 *
 */
public class BinaryTreeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinaryTreeService<Integer> bt = new BinaryTreeService<Integer>(new BinaryTreeNode<Integer>(5));
		
		bt.insertValue(8);
		//bt.insertValue(7);
		bt.insertValue(9);
		bt.insertValue(3);
		//bt.insertValue(2);
		bt.insertValue(4);
		/*bt.insertValue(1);
		bt.insertValue(-5);
		bt.insertValue(-2);
		bt.insertValue(-6);
		bt.insertValue(-4);
		*/
		BinaryTreeUtil<Integer> btUtil = new BinaryTreeUtil<Integer>();
		
		btUtil.inOrder(bt.getRoot());
		
		System.out.println(" Zig Zag Traversal : " + btUtil.printZigZag(bt.getRoot(), 4));
		System.out.println("Is Mirror Image : " + btUtil.isMirror(bt.getRoot()));
		/*System.out.println("Completed");
		System.out.println("Inorder Traversal : ");
		System.out.println(btUtil.getListNode());*/
		
		/*System.out.println("InOrder : " + btUtil.nonRecursiveInorder(bt.getRoot()));
		System.out.println("Pre Order : " + btUtil.nonRecursivePreOrder(bt.getRoot()));
		System.out.println("Post Order : " + btUtil.nonRecursivePostOrder(bt.getRoot()));
		System.out.println("Level Order : " + btUtil.levelOrder(bt.getRoot()));
		System.out.println("No. of nodes : " + btUtil.findingNoOfNode(bt.getRoot()));
		System.out.println("Height of Binary tree : " + btUtil.heigtOfBinaryTree(bt.getRoot()));
		System.out.println("Height of Binary tree NR two queues: " + btUtil.heightOfBinaryTreeNR(bt.getRoot()));
		System.out.println("Height of Binary tree NR one queue: " + btUtil.heightOfBinaryTreeNROneQueue(bt.getRoot()));*/
	}

}
