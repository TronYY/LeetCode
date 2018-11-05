package $106_ConstructBinaryTreefromInorderandPostorderTraversal_DFS;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder=new int[] {1,4,2,3};
		int[] inorder=new int[] {1,2,3,4};
		Solution solution=new Solution();
		TreeNode root=solution.buildTree(preorder, inorder);
		//System.out.println(root.left.val);
	}

}
