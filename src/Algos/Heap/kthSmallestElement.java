package Algos.Heap;

import Algos.Trees.TreeNode;

public class kthSmallestElement {
    int ans=0;
    int  counter=0;
    public int kthSmallest(TreeNode root, int k) {
        findKthSmallest(root,k);
        return ans;
    }
    public void findKthSmallest(TreeNode root , int k) {
        if(root == null ){
            return ;
        }
        findKthSmallest(root.left,k);
        counter++;
        if(counter == k ){
            ans = root.val;
            return;
        }
        findKthSmallest(root.right,k);
    }
}
