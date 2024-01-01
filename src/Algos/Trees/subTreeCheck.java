package Algos.Trees;

import Algos.Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class subTreeCheck {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null ){
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode cur=q.poll();
            if(cur.val == subRoot.val ){
                boolean match = checkMatch( cur , subRoot);
                if(match){
                    return true;
                }
            }
            if(cur.left != null){
                q.add(cur.left);
            }
            if(cur.right != null){
                q.add(cur.right);
            }
        }
        return false;
    }
    public boolean checkMatch(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot== null ){
            return true;
        }
        if(root == null || subRoot== null ){
            return false;
        }
        if(root.val != subRoot.val){
            return false;
        }
        return checkMatch( root.left , subRoot.left) && checkMatch( root.right, subRoot.right);
    }
}
