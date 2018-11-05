package $129_SumRoottoLeafNumbers_DFS;
class Solution {
	/*int result=0;
    public int sumNumbers(TreeNode root) {
    	if (root!=null) dfs(root,0);
    	return result;
        
    }
    
    public void dfs(TreeNode root,int temp) {
    	temp=temp*10+root.val;
    	if (root.left==null && root.right==null) {
    		result+=temp;
    		return;
    	}    	
    	if (root.left!=null) dfs(root.left, temp);
    	if (root.right!=null) dfs(root.right, temp);
    }*/
	
	public int sumNumbers(TreeNode root) {
    	return sum(root,0);
        
    }
	public int sum(TreeNode root,int s) {//s????root????????????????
		if (root==null) return 0;
		if (root.right==null && root.left==null) return s*10+root.val;//??????????????????????
		return sum(root.left, s*10+root.val)+sum(root.right, s*10+root.val);//s??????????????????????????????????????
		
		
	}
}
