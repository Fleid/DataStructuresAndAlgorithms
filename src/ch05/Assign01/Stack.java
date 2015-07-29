package ch05.Assign01;

/*
Implement a stack using a linked list as an underlying data structure (instead of array) 
What advantage do you think will it have against using arrays? 
You can use a DoublyLinkedNode.
*/

public class Stack
{
	// Ici on doit initialiser l'objet pour pouvoir l'utiliser
	// A mon avis parce que LinkedList n'a pas de constructeur, mais pas sur
	private LinkedList LL = new LinkedList();
	
	public void push( int data )
	{
		this.LL.insertAtHead( data );
	}
	
	public int pop()
	{
		if (LL.length() > 0)
		{
			int currentData = this.LL.readFromHead();
			this.LL.deleteFromHead();
			return currentData;			
		}
		return 0;
	}
	
	public int peek()
	{
		if (LL.length() > 0)
		{
			return this.LL.readFromHead();
		}
		return 0;
	}
	
}