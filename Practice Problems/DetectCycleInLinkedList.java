package testClass;
// DETECT AND REMOVE CYCLE IN LINKED LIST USING FLOYD'S CYCLE DETECTION ALGORITHM
public class DetectCycleInLinkedList {
static Node p = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(15);
		Node n2 = new Node(20);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(44);
		Node head = n1;
		n1.next=n2;
		n2.next  = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n1;
		Node meeting = detect(head);
		Node prevv = cycleStart(head);
		if(meeting != null) {
			System.out.println("cycle present");
			prevv.next = null;
		}
		else {
			System.out.println("cycle not present");
		}
		while(head != null) {
			System.out.println(head.data);			
			head = head.next;
		}
			
	}
  static Node detect (Node head) {
	  Node slow = head;
	  Node fast = head;
	  while(fast!=null && fast.next!=null) {
		  p = slow;
		  slow = slow.next;
		  fast = fast.next.next;
		  if(fast==slow) {
			  return slow;
		  }
	  }
	  return null;
  }
  static Node cycleStart(Node head) {
	  Node start = head;
	  Node meet = detect(head);
	  if(meet == null)
		  return start;
	  if(meet == start) {
		  Node pr = null;
		  start = start.next;
		  while (start!=meet) {
			  pr = start;
			  start = start.next;
		  }
		  return pr;
	  }
		  
	  Node prev = null;
	  while(start != meet) {
		  prev = meet;
		  start = start.next;
		  meet = meet.next;
		
	  }
	  prev.next = null;
	  return prev;
  }
  
}
