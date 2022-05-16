/*
Given a singly linkedlist like:
1->4->3->2

You have to calculate the sum of first and last elements like:
1+2 = 3
4+3 = 7

Then output the maximum sum. Here maximum sum is 7.

Space complexity should be O(1).
No constraint on time complexity.
*/

class Node{
	int data;
	Node next;
}
public class AmazonOALinkedList {
	public static void main(String[] args) {
		Node head= createList();
		System.out.println(getMax(head));
	}
	private static Node createList() {
		Node n = new Node();
		n.data = 1;
		
		Node n1 = new Node();
		n1.data = 4;
		Node n2 = new Node();
		n2.data = 3;
		Node n3 = new Node();
		n3.data = 2;
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		return n;
	}
	public static long getMax(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next!= null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		//1->4->3->2
		//reverse second half
		Node curr = slow;
		Node prev = null;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next= prev;
			prev = curr;
			curr = next;
		}
	//	now prev has last node and will traverse us till mid elem in reverse order.
		long res = 0;
		Node temp1 = prev;
		Node temp2 = head;
		while(temp1!=null && temp2!=slow) {
			res = Math.max(res, temp1.data+temp2.data);
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return res;
	}
}
