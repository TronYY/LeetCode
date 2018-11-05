package $110_BalancedBinaryTree_DFS_Easy;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode T1=new TreeNode(1);
		T1.left=new TreeNode(2);T1.right=new TreeNode(2);
		T1.left.left=new TreeNode(3);T1.left.right=new TreeNode(3);
		T1.left.left.left=new TreeNode(4);T1.left.left.right=new TreeNode(4);
		
		Solution solution=new Solution();
		System.out.println(solution.isBalanced(T1));
		//System.out.println(root.left.val);
	}

}
