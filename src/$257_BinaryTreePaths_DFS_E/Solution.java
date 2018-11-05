package $257_BinaryTreePaths_DFS_E;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> list=new ArrayList<String>();
    	binaryTreePathsHelper(root,list,"");
    	return list;
        
    }
    public void binaryTreePathsHelper(TreeNode root,List<String> list, String path) {
    	if (root==null) return;
    	String p=path+root.val;
    	if (root.left==null && root.right==null) {
    		list.add(p);
    		return;
    	}  	
    	binaryTreePathsHelper(root.left, list, p+"->");
    	binaryTreePathsHelper(root.right,list, p+"->");
    	
    }
}