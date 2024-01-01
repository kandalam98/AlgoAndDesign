package Algos.Trees;

public class constructBTfromPreAndInorder {
    int root = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder ,0 , inorder.length-1);
    }
    public TreeNode build(int[] preorder, int[] inorder,int low , int high) {
        if(low > high) {
            return null;
        }
        int index = findLow(preorder[root] , inorder , low ,high);
        TreeNode cur = new TreeNode(preorder[root]);
        if(low < index ){
            root++;
            cur.left = build(preorder,inorder ,low , index-1);
        }
        if(index < high ){
            root++;
            cur.right = build(preorder,inorder ,index+1, high);
        }
        return cur;
    }
    public int findLow(int value,int[] inorder , int low ,int high) {
        int index= -1;
        for(int i=0 ;i<inorder.length ;i++){
            if(value == inorder[i]){
                index= i;
                break;
            }
        }
        return index;

    }
}
