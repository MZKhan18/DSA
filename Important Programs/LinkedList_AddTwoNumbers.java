package codes;
//Given two decimal numbers represented by two linked lists of size N and M respectively. 
//The task is to return a linked list that represents the sum of these two numbers.
//
//For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 
//25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will 
//be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

//THIS METHOD DOES NOT WORK FOR ALL THE TEST CASES BECOC FOR VALUES LIKE 57999855392987 THE SIZE OF INT IS EXCEEDED

public class LinkedList_AddTwoNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(4);
		Node n3 = new Node(5);
		Node n4 = new Node(1);
		Node n5 = new Node(4);
		Node n6 = new Node(5);
		Node N1 = new Node(2);
		Node N2 = new Node(5);
		Node head1 =n1;
		Node head2 = N1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next =null;
		N1.next = N2;
		N2.next = null;
		Node revhead1 = reverse(head1);
		Node revhead2 = reverse(head2);
		int i1 = 0;
		int i2 = 0;
		int num1 =0;
		int num2 = 0;
		while(revhead1!=null) {
			num1 += revhead1.data * Math.pow(10, i1);
			i1++;
			revhead1 = revhead1.next;
		}
		while(revhead2!=null) {
			num2 += revhead2.data * Math.pow(10, i2);
			i2++;
			revhead2 = revhead2.next;
		}
		int ans = num1+num2;
		int ans1 = ans;
		Node ansHead = null;
		Node ansTail = null;
		while(ans>0) {
			int val = ans%10;
			ans = ans/10;
			Node newNode = new Node(val);
			if(ansHead==null) {
				ansHead = newNode;
				ansTail = newNode;
			}else {
				ansTail.next = newNode;
				ansTail = newNode;
			}
		}
		System.out.println(num1+"+"+num2+"="+ans1);
		Node finalAns = reverse(ansHead);
		while(finalAns!=null) {
			System.out.println(finalAns.data);
			finalAns = finalAns.next;
		}
		
	}
	static Node reverse(Node head) {
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
