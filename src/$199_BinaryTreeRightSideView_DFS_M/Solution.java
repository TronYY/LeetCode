package $199_BinaryTreeRightSideView_DFS_M;

import java.util.ArrayList;
import java.util.List;

class Solution {
	int[] right=new int [100000];
	int maxDepth=0;
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result=new ArrayList<Integer>();
        if (root==null) return result;
        dfs(root,-1);
        
        
		for (int i=0;i<=maxDepth;i++)
			result.add(right[i]);
		return result;
        
    }
	public void dfs(TreeNode root,int depth) {
		if (root==null) return;
		depth++;
		maxDepth=Math.max(maxDepth, depth);
		right[depth]=root.val;
		dfs(root.left,depth);
		dfs(root.right,depth);
		
		
	}
}
/*更好的解法
 * public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null){
            return res;
        }
        dfs (root, res, 0);
        return res;
    }
    
    public void dfs (TreeNode root, List<Integer> res, int level){
        if (root == null){
            return;
        }
        if (res.size() == level){
            res.add (root.val);
        }
        if (root.right != null){
            dfs (root.right, res, level + 1);
        }
        if (root.left != null){
            dfs (root.left, res, level + 1);
        }
    }
}*/
 