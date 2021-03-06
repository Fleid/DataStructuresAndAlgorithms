package ch05.Assign01;

public class LinkedList
{
	private DNode headNode;
	
	public void insertAtHead( int data )
	{
		DNode newHead = new DNode( data );
		newHead.setNextNode(this.headNode);
		this.headNode = newHead;
	}
	
	public int readFromHead()
	{
		return this.headNode.getData();
	}

	public void deleteFromHead()
	{
		this.headNode = this.headNode.getNextNode();
	}

	public int length()
	{
		int length = 0;
		
		DNode current = this.headNode;
		
		while (current != null)
		{
			length++;
			current = current.getNextNode();
		}
		
		return length;		
	}
	
	@Override
	public String toString()
	{
		String result = "{";
		
		DNode current = this.headNode;
		
		while (current != null)
		{
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		
		result += "}";
		
		return result;
	}
	
}
