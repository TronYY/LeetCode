package $108_ConvertSortedArraytoBinarySearchTree_DFS_E;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    	return sortedHelper(nums,0,nums.length-1);
        
    }
    
    public TreeNode sortedHelper(int[] nums,int start,int end) {
    	if (start>end) return null;
    	int mid=(start+end)/2;
    	TreeNode root=new TreeNode(nums[mid]);
    	root.left=sortedHelper(nums, start, mid-1);
    	root.right=sortedHelper(nums, mid+1, end);
    	return root;
    }
}