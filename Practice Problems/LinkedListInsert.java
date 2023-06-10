package testClass;

public class LinkedListInsert {
//	we have to insert a node in between the list
//	5 4 2 5 
//	0 1 2 3
//	we want to insert "9" in btw "4" and "2" that means in the 2nd position

	public static void main(String[] args) {
		// TODO Auto-generate;d method stub
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
		insert(33,4,head);
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	static void insert(int data, int pos, Node head) {
		Node newNode = new Node( data);
		if(pos==0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node prevNode = head;
		for(int i=0; i<pos-1; i++) {
			prevNode = prevNode.next;
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

}
