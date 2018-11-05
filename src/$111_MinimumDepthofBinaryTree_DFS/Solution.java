package $111_MinimumDepthofBinaryTree_DFS;

public class Solution {
	int result=Integer.MAX_VALUE;
	public int minDepth(TreeNode root) {
		
		int depth=0;
		if (root==null) return 0;
		dfs(root,depth);
		return result;
		
	}
	public void dfs(TreeNode root,int depth) {
		if (root==null) return;
		depth++;
		if (root.left==null && root.right==null ) {
			result=Math.min(result, depth);
			return;
		}
		
		dfs(root.left, depth);
		dfs(root.right, depth);
	}

}

/*public int minDepth(TreeNode root) {
    if (root == null)
        return 0;
    if (root.left != null && root.right != null) //����˫֧������������С��
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    else //���ǵ�ֻ���������
        return Math.max(minDepth(root.left), minDepth(root.right))+1;
}*/
