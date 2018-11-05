package $094_BinaryTreeInorderTraversal_Tree_M;

import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	
    	List<Integer> list=new ArrayList<Integer>();
    	inorderHelper(root,list);
        return list;
    }
    
    public void inorderHelper(TreeNode root,List<Integer> list) {
    	if (root==null) return;
    	inorderHelper(root.left,list);
    	list.add(root.val);
    	inorderHelper(root.right,list);
    }
    
}
