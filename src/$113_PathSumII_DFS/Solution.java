package $113_PathSumII_DFS;

import java.util.ArrayList;
import java.util.List;


class Solution {
	protected List<List<Integer>> result=new ArrayList<List<Integer>>();
	
	public List<List<Integer>> pathSum(TreeNode root, int sum)     
    {
		dfs(root,sum,new ArrayList<Integer>());
		return result;
         
    }
	
	public void dfs(TreeNode root,int sum,List<Integer> list) {
		if (root==null) return;
    	sum-=root.val;
    	list.add(root.val);
    
    	if (root.left==null && root.right==null) {
    		if (sum==0) result.add(new ArrayList<Integer>(list));//若符合，则list的新建，加到result中
    		return;
    	}
    	if (root.left!=null) {
    		dfs(root.left,sum,list);//list是采用引用传递
    		list.remove(list.size()-1);
    	}
    	if (root.right!=null) {
    		dfs(root.right,sum,list);
    		list.remove(list.size()-1);
    	}
    	
	}
}
