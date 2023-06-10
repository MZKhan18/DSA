package testClass;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(2);
		Node n2 = new Node(5);
		Node n3 = new Node(2);
		Node n4 = new Node(1);
		Node n5 = new Node(11);
		Node head = n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		n4.next=null;
		n5.next=null;		
		System.out.println(palindrome(head));
	}
	static boolean palindrome(Node head) {
		if(head==null)
			return true;
		if(two(head)) {
			if(head.data==head.next.data) {
				return true;
			}else {
				return false;
			}
		}
		Node mid = middle(head);
		Node last = reverse(mid);
		while(last!=null) {
			if(head.data!=last.data)
				return false;
			last = last.next;
			head = head.next;
		}
		return true;		
	}
	static boolean two(Node head) {  //checking if linked list size is 2
		int n=0;
		while(head!=null) {
			head = head.next;
			n++;
		}
		if(n==2)
			return true;
		return false;
	}
	static Node middle(Node head) {
		Node fast =  head;
		Node slow = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	static Node reverse (Node head) {
		Node cur = head;
		Node prev = null;
		while(cur!=null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;			
		}
		return prev;
	}

}
