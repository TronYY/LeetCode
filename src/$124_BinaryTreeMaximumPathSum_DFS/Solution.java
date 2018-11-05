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
    	int right=Math.max(0,dfs(root.right));//����֧С���㣬��֧С�����ʱ�����ȥ��
    	result=Math.max(result, left+root.val+right);//�����������䣬�Ͳ��� �ֿ��ж�ֻ����֧ ��ֻ����֧���Ƕ��á�
    	//�������Ľ����֪ͨ��ȫ���ڵ�ģ��������Ľ���Ǹ��ϲ�ڵ�ġ�
    	return Math.max(left, right)+root.val;//���ظ������ʱ���ϲ�ֻ�ߵ�֧
    }
}
