package $105_ConstructBinaryTreefromPreorderandInorderTraversal_DFS;

import java.util.Arrays;





public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return (build(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1));
        
    }
	public TreeNode build(int[] preorder, int[] inorder,int pstart,int pend,int istart, int iend) {
		if (pstart>pend) return null;
		TreeNode root=new TreeNode(preorder[pstart]);
		if (pstart==pend) return root;
		int indexRootInorder=index(inorder, preorder[pstart], istart);
		root.left=build(preorder, inorder, pstart+1, pstart+indexRootInorder-istart, istart, indexRootInorder-1);
		root.right=build(preorder, inorder, pstart+indexRootInorder-istart+1, pend, indexRootInorder+1, iend);//µİ¹é×óÓÒ×ÓÊ÷
		return root;		
	}
	
	public int index(int[] array,int val,int start) {
		for (int i=start;i<array.length;i++) 
			if (array[i]==val) return i;
		return 0;	
		
	}
}
