package codes;

//Given two singly linked lists of size N and M, 
//write a program to get the point where two linked lists intersect each other.


public class LinkedList_Y_Shaped_Inersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(40);
		Node n3 = new Node(30);
		Node N1 = new Node(22);
		Node N2 = new Node(1);
		Node head1 =n1;
		Node head2 = N1;
		n1.next=n2;
		n2.next = n3;
		n3.next = null;
		N1.next = N2;
		N2.next = n2;
		int ans = intersectPoint(head1,head2);
		System.out.println(ans);

	}

	static int intersectPoint(Node head1, Node head2)
	{   
	    Node n1 = head1;
	    Node n2 = head2;
	    int l1 =0;
	    int l2 = 0;
	    while(n1!=null){
	        l1++;
	        n1 = n1.next;
	    }
	    while(n2!=null){
	        l2++;
	        n2 = n2.next;
	    }
	    n1 = head1;
	    n2 = head2;
	    if(l1>l2){
	        for(int i=0; i<l1-l2;i++){
	            n1 = n1.next;
	        }
	    }else if(l2>l1){
	        for(int i=0; i<l2-l1; i++){
	            n2 = n2.next;
	        }
	    }
	    
         while(n1!=null){
             if(n1==n2){
                 return n1.data;
              }
              n1=n1.next;
              n2 = n2.next;
         }
         return -1;
	}
	
}
class Node{    
    int data;    
    Node next;    
        
    public Node(int data) {    
        this.data = data;    
    }    
}