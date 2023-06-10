package codes;

public class LinkedList_mergeTwoLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(3);
		Node n2 = new Node(5);
		Node n3 = new Node(8);
		Node head1 =n1;
		n1.next=n2;
		n2.next = n3;
		n3.next = null;
		Node N1 = new Node(1);
		Node N2 = new Node(2);
		Node N3 = new Node(9);
		Node head2 =N1;
		N1.next=N2;
		N2.next = N3;
		N3.next = null;
		Node i = n1;
		Node j =N1;
		Node newList = new Node(0);
		Node cur  =newList;
		
		while(i!=null && j!=null) {
			if(i.data>j.data) {
				cur.next=j;
				j=j.next;
			}else {
				cur.next=i;
				i=i.next;
			}
			cur = cur.next;
		}
		if(i==null) {
			cur.next=j;
		}
		if(j==null){
			cur.next=i;
		}
		newList = newList.next;
		while(newList!=null) {
			System.out.println(newList.data);
			newList = newList.next;
		}
		
	}

}
