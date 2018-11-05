package $114_FlattenBinaryTreetoLinkedList_DFS;

class Solution {
    public void flatten(TreeNode root) {
    	if (root==null) return;
    	flatten(root.left);
    	flatten(root.right);
    	TreeNode tN=root.left;
    	if (tN!=null) {//左子树为0就不用考虑
    		while (tN.right!=null) tN=tN.right;
    		tN.right=root.right;
    	   	root.right=root.left;
    	}
    	root.left=null;//左支清零
    	return;
    	
    	
        
    }
}
