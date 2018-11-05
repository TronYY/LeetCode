package $101_SymmetricTree_DFS_E;

class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root==null) return true;
		return isSymmetricHelper(root.left, root.right); 
	        
	}
    public boolean isSymmetricHelper(TreeNode p, TreeNode q) {
    	if (p==null && q==null) return true;
    	if (p==null || q==null) return false; //∂‘’’œ¬100
    	return ((p.val==q.val)&& isSymmetricHelper(p.left, q.right)&&isSymmetricHelper(p.right, q.left))  ;
    	
        
    }
}
