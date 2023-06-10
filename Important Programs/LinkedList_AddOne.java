package codes;


//A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.
public class LinkedList_AddOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(3);
		Node n2 = new Node(5);
		Node n3 = new Node(8);
		Node head =n1;
		n1.next=n2;
		n2.next = n3;
		n3.next = null;
		Node last = reverse(head);
		if(last.data<9) {
			last.data = last.data+1;
		}else {
		Node carry = new Node(0);
		if(last.data==9)
			add(last,carry);}
		Node ans = reverse(last);
		while(ans!=null) {
			System.out.println(ans.data);
			ans= ans.next;
		}
		
	}
	static void add(Node n,Node c) {
		Node cur = n;
		cur.data = 0;
		if(cur.next==null)
			cur.next = c;
		if(cur.next.data!=9) {
			cur.next.data=cur.next.data+1;
			}else {
				add(cur.next,c);
			}
		
	}
	
	static Node reverse(Node head) {
		Node cur = head;
		Node prev = null;
		while(cur!=null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;			
		}
		return prev;
	}

}
