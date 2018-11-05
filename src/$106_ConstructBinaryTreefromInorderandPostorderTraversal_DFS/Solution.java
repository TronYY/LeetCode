package $106_ConstructBinaryTreefromInorderandPostorderTraversal_DFS;

import java.util.Arrays;





public class Solution {
	public TreeNode buildTree( int[] inorder,int[] postorder) {
		return (build( inorder, postorder,0, inorder.length-1, 0, postorder.length-1));
        
    }
	public TreeNode build(int[] inorder,int[] postorder,int istart, int iend,int pstart,int pend) {
		if (pstart>pend) return null;
		TreeNode root=new TreeNode(postorder[pend]);
		if (pstart==pend) return root;
		int indexRootInorder=index(inorder, postorder[pend], istart);
		root.left=build(inorder, postorder, istart, indexRootInorder-1,pstart, pstart+indexRootInorder-istart-1);
		root.right=build( inorder, postorder,indexRootInorder+1, iend,pstart+indexRootInorder-istart, pend-1);//µÝ¹é×óÓÒ×ÓÊ÷
		return root;		
	}
	
	public int index(int[] array,int val,int start) {
		for (int i=start;i<array.length;i++) 
			if (array[i]==val) return i;
		return 0;	
		
	}
}
