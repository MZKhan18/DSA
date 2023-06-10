package testClass;

class LinkedListCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(40);
		Node n3 = new Node(30);
		Node head =n1;
		n1.next=n2;
		n2.next = n2;
		n3.next = null;
	}
	
}

class Node{    
    int data;    
    Node next;    
        
    public Node(int data) {    
        this.data = data;    
    }    
} 
