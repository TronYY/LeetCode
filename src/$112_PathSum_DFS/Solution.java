package $112_PathSum_DFS;

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
    	if (root==null) return false;
    	sum-=root.val;
    	/*if (sum<0) return false; */ //不一定节点的值都是正数
        if (root.left==null && root.right==null && sum==0) return true;
        return (hasPathSum(root.left, sum)||hasPathSum(root.right, sum));
         
    }
}
