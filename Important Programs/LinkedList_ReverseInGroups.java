package codes;


//Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list. 
//If the number of nodes is not a multiple of k then left-out nodes, in the end, should be considered as a group and must be reversed
public class LinkedList_ReverseInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node head =n1;
		n1.next=n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		int k = 3;
		Node ans = reverse(head,k);
		while(ans!=null) {
			System.out.println(ans.data);
			ans = ans.next;
		}
		
		
	}
	static Node reverse(Node head, int k) {
		Node cur = head;
		Node prev = null;
		Node next=null;
		int c =0;
		while(cur!=null && c<k) {
//			Node temp = cur.next;
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			c++;
		}
		if(next!=null) {
			head.next = reverse(next,k);
		}
		return prev;
	}

}
