package testClass;

public class ReverserLinkedList_Itarative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(15);
		Node n2 = new Node(20);
		Node n3 = new Node(3);
		Node n4 = new Node(43);
		Node head = n1;
		n1.next=n2;
		n2.next  = n3;
		n3.next = n4;
		n4.next = null;
	Node reversed = reverse(head);
	 	while(reversed !=null) {
	 		System.out.println(reversed.data);
	 		reversed = reversed.next;
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
