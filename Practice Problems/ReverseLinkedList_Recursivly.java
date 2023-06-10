package testClass;

public class ReverseLinkedList_Recursivly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(15);
		Node n2 = new Node(20);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
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
		
		if(head == null || head.next == null)
			return head;
		Node newHead = reverse(head.next);
		Node headNext = head.next;
		headNext.next = head;
		head.next = null;
		return newHead;
		
	}
}
