package $124_BinaryTreeMaximumPathSum_DFS;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tN=new TreeNode (1);
		tN.left=new TreeNode(2);
		tN.right=new TreeNode(3);
		Solution solution=new Solution();
		System.out.println(solution.maxPathSum(tN));
	}

}
