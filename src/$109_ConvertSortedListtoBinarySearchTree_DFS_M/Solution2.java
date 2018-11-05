package $109_ConvertSortedListtoBinarySearchTree_DFS_M;

class Solution2 {
    public TreeNode sortedListToBST(ListNode head) {
    	if (head==null) return null;
    	ListNode end=head;
    	while (end.next!=null) end=end.next;
        return getTreeConstructed(head, end);
    }
    
    public TreeNode getTreeConstructed(ListNode head, ListNode end) {
    	//注意要判断end为null——end为null就是左半子树没了——其实按照下面的while循环最终弄下去肯定现有两个元素的(a,b)，退出while循环时两个元素的slow指在第一个元素做root，pre是空，左半部分是（head，null），右半部分是（end，end）右半部分相等所以返回b,左半部分要判断空就不能用head，必须用end==null
    	//这个判断得结合后面的while来。。。
    	if ( end==null) return null;
        if(head==end) return new TreeNode(head.val);
        //总的想法还是和二分法差不多，这儿slow就是中心点，由于是单向的，必须要置顶中心点的前一个元素所以用了一个slowPre（一开始设为null，之后slow挪动前先记录为slow）
        ListNode slow=head, fast=head,slowPre=null;
        while(fast!=end&& fast.next!=end ) {
        	slowPre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = getTreeConstructed(head,slowPre);
        root.right = getTreeConstructed(slow.next, end);
        return root;
    }
}

/*
blog中
while (fast&&slow)
{
　　if (fast->next==NULL)
　　    return slow ->data;
　　else if (fast->next!= NULL && fast->next->next== NULL)
　　    return (slow ->data + slow ->next->data)/2;
　　else
　　{
　　    fast= fast->next;
　    　fast= fast->next;
　　    slow = slow ->next;
　　}
　}
*/