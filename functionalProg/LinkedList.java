package dataStructures;

class Node {
	int data;
	Node next;
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class LinkedList {
	Node head;
	public LinkedList(){
		head = null;
	}
	public void addNewNode(int data)
	{
		Node temp = new Node(data);
		Node iterate = null;
		if(head == null)
		{
			head = temp;
		}
		else
		{
			iterate = head;
			while(iterate.next!=null)
			{
				iterate = iterate.next;
			}
			iterate.next = temp;
		}
	}
	
	public void printList()
	{
		Node iterate = head;
		while(iterate!=null)
		{
			System.out.println("Node : " + iterate.data);
			iterate = iterate.next;
		}
	}
	
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.addNewNode(5);
		list.addNewNode(6);
		list.addNewNode(3);
		list.printList();
	}
}
