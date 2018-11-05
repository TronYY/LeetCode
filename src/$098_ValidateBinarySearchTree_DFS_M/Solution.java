package $098_ValidateBinarySearchTree_DFS_M;



class Solution {
	public boolean isValidBST(TreeNode root) {
		
		return isHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
		
        
    }
	public boolean isHelper(TreeNode root,long inf,long sup) {
		if (root==null) return true;
		if ((isHelper(root.left,inf,root.val))&&(isHelper(root.right,root.val,sup))&&(root.val<sup)&&(inf<root.val)) return true;
		return false;
	}
}
