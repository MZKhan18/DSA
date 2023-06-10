package codes;

//import testClass.Node
//REMOVE DUPICATE FROM SORTED LINKED LIST

public class LinkedList_Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(2);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(10);
		Node head =n1;
		n1.next=n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null		;
		Node cur = head;
		Node next = null;
		while(cur.next !=null) {
			if(cur.data == cur.next.data) {
				next = cur.next.next;
				cur.next.next = null;
				cur.next = next;
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
