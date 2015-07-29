package ch05.Assign01;

public class TestLinkedList
{
	public static void main( String[] args )
	{
		LinkedList LL = new LinkedList();
		
		LL.insertAtHead(5);
		LL.insertAtHead(10);
		LL.insertAtHead(2);
		LL.insertAtHead(12);
		LL.insertAtHead(19);
		LL.insertAtHead(20);
		
		System.out.println(LL);	
		
		LL.deleteFromHead();
		System.out.println("At the head : " + LL.readFromHead());
		LL.deleteFromHead();
		System.out.println("At the head : " + LL.readFromHead());
		
	}
}