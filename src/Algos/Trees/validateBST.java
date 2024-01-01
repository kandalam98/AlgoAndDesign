package Algos.Trees;

import Algos.Trees.TreeNode;

public class validateBST {
    public boolean isValidBST(TreeNode root) {
        return checkBST(root , null , null);
    }
    public boolean checkBST(TreeNode root , Integer min ,Integer max){
        if( root == null)return true;
        if( (min!=null && min >= root.val) || ( max!=null&& max<= root.val) ){
            return false;
        }
        return checkBST(root.left ,min,root.val) && checkBST(root.right ,root.val,max);
    }
}
