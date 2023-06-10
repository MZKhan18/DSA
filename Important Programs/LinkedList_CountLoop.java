package codes;
//Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given 
//Linked List contains a loop or not and if the loop is present then return the count of nodes in a loop or else return 0. 
//C is the position of the node to which the last node is connected. If it is 0 then no loop.


public class LinkedList_CountLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);   // 1 2 3 4 5
		Node n5 = new Node(5);
		Node head = n1;
		int k=0;
		boolean loop = false;
		n1.next=n2;
		n2.next  = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3;
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				loop = true;
				break;
				}
		}
		Node next = slow.next;
		if(loop) {
			k=k+1;
			while(next!=slow) {
				next = next.next;
				k = k+1;
			}
		}

		System.out.println(k);
	}
	

}
