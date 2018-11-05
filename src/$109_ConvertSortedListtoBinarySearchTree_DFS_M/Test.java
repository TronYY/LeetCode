package $109_ConvertSortedListtoBinarySearchTree_DFS_M;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] a=new ListNode[5];
		a[0]=new ListNode(-10);
		a[1]=new ListNode(-3);
		a[2]=new ListNode(0);
		a[3]=new ListNode(5);
		a[4]=new ListNode(9);
		for (int i=0;i<4;i++) {
			a[i].next=a[i+1];
		}
		Solution2 solution2=new Solution2();
		solution2.sortedListToBST(a[0]);
			
	}

}
