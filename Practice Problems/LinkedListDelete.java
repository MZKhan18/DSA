package testClass;

public class LinkedListDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node head = n1;
		n1.next=n2;
		n2.next  = n3;
		n3.next = n4;
		n4.next = null;
		Node temp = head;
		delete(1,head);
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}
	static void delete(int pos, Node head) {
		if(pos==0) {
			head = head.next;
			return;
		}
		Node prevNode = head;
		for(int i=0; i<pos-1; i++) {
			prevNode = prevNode.next;
		}
		prevNode.next = prevNode.next.next;
	}
}
