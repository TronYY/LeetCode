package $109_ConvertSortedListtoBinarySearchTree_DFS_M;

class Solution2 {
    public TreeNode sortedListToBST(ListNode head) {
    	if (head==null) return null;
    	ListNode end=head;
    	while (end.next!=null) end=end.next;
        return getTreeConstructed(head, end);
    }
    
    public TreeNode getTreeConstructed(ListNode head, ListNode end) {
    	//ע��Ҫ�ж�endΪnull����endΪnull�����������û�ˡ�����ʵ���������whileѭ������Ū��ȥ�϶���������Ԫ�ص�(a,b)���˳�whileѭ��ʱ����Ԫ�ص�slowָ�ڵ�һ��Ԫ����root��pre�ǿգ���벿���ǣ�head��null�����Ұ벿���ǣ�end��end���Ұ벿��������Է���b,��벿��Ҫ�жϿվͲ�����head��������end==null
    	//����жϵý�Ϻ����while��������
    	if ( end==null) return null;
        if(head==end) return new TreeNode(head.val);
        //�ܵ��뷨���ǺͶ��ַ���࣬���slow�������ĵ㣬�����ǵ���ģ�����Ҫ�ö����ĵ��ǰһ��Ԫ����������һ��slowPre��һ��ʼ��Ϊnull��֮��slowŲ��ǰ�ȼ�¼Ϊslow��
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
blog��
while (fast&&slow)
{
����if (fast->next==NULL)
����    return slow ->data;
����else if (fast->next!= NULL && fast->next->next== NULL)
����    return (slow ->data + slow ->next->data)/2;
����else
����{
����    fast= fast->next;
��    ��fast= fast->next;
����    slow = slow ->next;
����}
��}
*/