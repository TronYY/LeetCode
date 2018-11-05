package $110_BalancedBinaryTree_DFS_Easy;


public class Solution {
	//boolean flag=true;
	public boolean isBalanced(TreeNode root) {
		if (root==null) return true;
		int l=getDepth(root.left);
		int r=getDepth(root.right);
		if (Math.abs(l-r)>1) return false;
		return isBalanced(root.left) && isBalanced(root.right);
	}
	
	public int getDepth(TreeNode root) {
		if  (root==null) return 0;
		return Math.max(getDepth(root.left), getDepth(root.right))+1;
	}
	/*public void dfs(TreeNode root) {
		
		if (root==null) return;
		
		flag=(Math.abs(getHeight(root.left)-getHeight(root.right))<=1);
		if (!flag) return;
		dfs(root.left);
		if (!flag) return;
		dfs(root.right);
		if (!flag) return;
		
    }*/
	
	/*public int calHeight(TreeNode root) {
		if (root==null) return 0;
		root.val=Math.max(calHeight(root.left),calHeight(root.right))+1;
		return root.val;
	}
	public int getHeight(TreeNode root) {
		if (root==null) return 0;
		return root.val;
	}*/
	

}

