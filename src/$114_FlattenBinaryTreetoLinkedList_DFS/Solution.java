package $114_FlattenBinaryTreetoLinkedList_DFS;

class Solution {
    public void flatten(TreeNode root) {
    	if (root==null) return;
    	flatten(root.left);
    	flatten(root.right);
    	TreeNode tN=root.left;
    	if (tN!=null) {//������Ϊ0�Ͳ��ÿ���
    		while (tN.right!=null) tN=tN.right;
    		tN.right=root.right;
    	   	root.right=root.left;
    	}
    	root.left=null;//��֧����
    	return;
    	
    	
        
    }
}
