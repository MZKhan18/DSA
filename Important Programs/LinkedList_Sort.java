package codes;

//Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. 
//The task is to segregate 0s, 1s, and 2s linked list such that
//all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

public class LinkedList_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(0);
		Node n4 = new Node(0);
		Node n5 = new Node(1);
		Node n6 = new Node(2);
		Node head1 =n1;
		n1.next=n2;
		n2.next = n3;
		n3.next = n4;
		n4.next=n5;
		n5.next = n6;
		n6.next=null;
		Node cur = head1;
		int count0=0;
		int count1=0;
		int count2=0;
		while(cur!=null) {
			if(cur.data==0) count0++;
			else if(cur.data==1) count1++;
			else count2++;
			cur = cur.next;
		}
		cur = head1;
		while(count0>0) {
			cur.data = 0;
			cur = cur.next;
			count0--;
		}
		while(count1>0) {
			cur.data = 1;
			cur = cur.next;
			count1--;
		}
		while(count2>0) {
			cur.data = 2;
			cur = cur.next;
			count2--;
		}
		while(head1!=null) {
			System.out.println(head1.data);
			head1 = head1.next;
		}
	}
	

}
