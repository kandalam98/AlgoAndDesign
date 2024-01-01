package Algos.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class binaryLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if( root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> pq = new ArrayDeque<>();
        pq.offer(root);
        while(!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = pq.size();
            for(int i=0 ;i<size ;i++) {
                TreeNode curr = pq.poll();
                temp.add(curr.val);
                if(curr.left != null){
                    pq.offer(curr.left);
                }
                if(curr.right != null){
                    pq.offer(curr.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
