package codes;

import java.util.HashSet;

//Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. 
//When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.
// TIME COMPLEXITY = O(N)
// SPACE COMPLEXITY = O(N)

public class LinkedList_removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		Node n1 = new Node(3);
		Node n2 = new Node(4);
		Node n3 = new Node(3);
		Node head =n1;
		n1.next=n2;
		n2.next = n3;
		n3.next = null;
		Node cur = head;
		h.add(head.data);
		while(cur!=null && cur.next!=null) {
			h.add(cur.data);
			Node temp = cur.next;
			if(h.contains(temp.data)) {
				cur.next=cur.next.next;
			}else {
			cur = cur.next;
			}
		}
		Node i = head;
		while(i!=null) {
			System.out.println(i.data);
			i = i.next;
		}
		
	}

}
