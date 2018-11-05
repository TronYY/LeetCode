package $124_BinaryTreeMaximumPathSum_DFS;


class Solution {
	int result=-Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
    	int temp=dfs(root);
    	result=Math.max(result, temp);
    	return result;
        
    }
    public int dfs(TreeNode root) {
    	if (root==null) return 0;
    	int left=Math.max(0, dfs(root.left));
    	int right=Math.max(0,dfs(root.right));//把左支小于零，右支小于零的时候就舍去了
    	result=Math.max(result, left+root.val+right);//有了上面两句，就不用 分开判断只用左支 、只用右支还是都用。
    	//上面这句的结果是通知给全部节点的，下面这句的结果是给上层节点的。
    	return Math.max(left, right)+root.val;//返回给上面的时候，上层只走单支
    }
}
