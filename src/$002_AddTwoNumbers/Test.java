package $002_AddTwoNumbers;

import java.awt.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("1st");
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		ListNode l1=new ListNode(input);
		ListNode l1head=l1;
		
		while ((input=in.nextInt())>=0) {
			l1.next=new ListNode(input);
			l1=l1.next;
		}
		
		System.out.println("2nd ");
		ListNode l2=new ListNode(in.nextInt());
		ListNode l2head=l2;
		while ((input=in.nextInt())>=0) {
			l2.next=new ListNode(input);
			l2=l2.next;
		}
		
		Solution solution=new Solution();
		ListNode l3=solution.addTwoNumbers(l1head, l2head);
		
		// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
		//Output: 7 -> 0 -> 87 -> 0 -> 8
		System.out.print(" "+l3.val);
		l3=l3.next;
		while (l3!=null) {
			System.out.print(" -> "+l3.val);
			l3=l3.next;
		}

		System.out.println (-1 %4 );
			
			

	}

}