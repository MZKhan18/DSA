//Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, 
//where k is a given positive integer smaller than or equal to length of the linked list.
package codes;


public class LinkedList_Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node head = n1;
		int k =5;
		n1.next=n2;
		n2.next  = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		Node size = head;
		int i=0;
		while(size!=null) {
			size = size.next;
			i++;
		}
		Node cur = head;
		if(i!=k) {
		while(k>1) {
			cur = cur.next;
			k=k-1;
			}
		}
		Node newHead = cur.next;
		cur.next=null;
		Node curr=newHead;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next =head;
		
		while(newHead!=null) {
			System.out.println(newHead.data);
			newHead = newHead.next;
		}
		
	}

}
