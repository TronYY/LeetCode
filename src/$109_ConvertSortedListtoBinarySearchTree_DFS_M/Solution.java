package $109_ConvertSortedListtoBinarySearchTree_DFS_M;

import sun.reflect.generics.tree.Tree;

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    	if (head==null) return null;
    	int[] arr =new int[100000];
    	int len=0;
    	while (head!=null) {
    		arr[len]=head.val;
    		len++;
    		head=head.next;
    	}
    	len--;
    	return sortedHelper(arr,0,len);
        
    }
    
    public TreeNode sortedHelper(int[] arr,int start,int end) {
    	if (start>end) return null;
    	int mid=(start+end)/2;
    	TreeNode root=new TreeNode(arr[mid]);
    	root.left=sortedHelper(arr, start, mid-1);
    	root.right=sortedHelper(arr, mid+1, end);
    	return root;
    }
}