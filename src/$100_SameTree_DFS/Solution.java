package $100_SameTree_DFS;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p==null && q==null) return true;
    	if (p==null && q!=null ||p!=null && q==null) return false; //�����п���дΪif (p == NULL || q == NULL) return false;
    	if ((p.val==q.val)&& isSameTree(p.left, q.left)&&isSameTree(p.right, q.right))  return true;
    	return false;
        
    }
}
