package Algos.Trees;

import Algos.Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null ){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            TreeNode left = curr.left;
            curr.left = curr.right;
            curr.right = left ;
            if( curr.left !=null ){
                queue.add(curr.left);
            }
            if( curr.right !=null ){
                queue.add(curr.right);
            }
        }
        return root;
    }
}
