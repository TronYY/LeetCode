package $002_AddTwoNumbers;

public class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode l3=new ListNode(0);
		 ListNode head=l3;
		 int sup=0;
		 do {
			 l3.next=new ListNode(0);
			 l3=l3.next;
			 int l1v=(l1==null)? 0:l1.val;
			 int l2v=(l2==null)? 0:l2.val;
			 
			 l3.val=sup+l1v+l2v;
			 sup=l3.val / 10;
			 l3.val=l3.val%10;
			 if (l1!=null) l1=l1.next;
			 if (l2!=null) l2=l2.next;
		 } while (l1!=null || l2!=null);
		 if (sup>0) l3.next=new ListNode(sup);
		 return head.next;		 
	 }
	
}