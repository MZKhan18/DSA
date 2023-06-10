package testClass;

public class LinkedListTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(30);
		Node n3 = new Node(30);
		Node head = n1;
		n1.next = n2;
		n2.next= n3;
		n3.next = null;
		System.out.println("data values");
		traverse(n1);
	}
	public static void traverse( Node head ){
		Node cur = head;
		while(cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}

}

//class Node{    
//    int data;    
//    Node next;    
//        
//    public Node(int data) {    
//        this.data = data;    
//    }    
//} 