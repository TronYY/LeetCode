package $230_KthSmallestElementinaBST_BS_M;

class Solution {
	int t=0,ans=0;
    public int kthSmallest(TreeNode root, int k) {
    	dfs(root,k);
    	return ans;
        
    }
    public int dfs(TreeNode root, int k) {
    	if (root==null) return 0;
    	dfs(root.left, k);
    	t++;//���ʵ��˵�ǰ�ڵ㣬������һ
    	if (t==k) return ans=root.val;
    	dfs(root.right, k);
    	return 0;
    }
}