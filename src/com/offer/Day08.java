package com.offer;

public class Day08 {

	public static void main(String[] args) {
		
		Day08 d = new Day08();
		Node head = d.new Node(0);
		
		Node node1 = d.new Node(1);
		Node node2 = d.new Node(2);
		Node node3 = d.new Node(3);
		Node node4 = d.new Node(4);
		Node node5 = d.new Node(5);
		Node node6 = d.new Node(6);
		Node node7 = d.new Node(7);
		Node node8 = d.new Node(8);
		Node node9 = d.new Node(9);
		Node node10 = d.new Node(10);
		Node node11 = d.new Node(11);
		Node node12 = d.new Node(12);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		node10.next = node11;
		node11.next = node12;
		node12.next = null;
		
		Node n = d.findNodeToTail(head, 12);
		System.out.println(n.data);
	}
	
	/**
	 * 打印单向链表的倒数第n个节点
	 * @param head
	 * @param k
	 * @return
	 */
	public Node findNodeToTail(Node head, int k) {
		
		
		if (head == null || head.next == null || k == 0)
			return null;
		
		Node node = head;
		
		for (int i = 1; i < k; i++) {
			node = node.next;
			
			if (node.next == null)
				return null;
		}
		
		Node secondNode = head;
		
		while (node.next != null) {
			node = node.next;
			secondNode = secondNode.next;
		}
		
		return secondNode;
	}
	
	
	
	
	
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}

}
