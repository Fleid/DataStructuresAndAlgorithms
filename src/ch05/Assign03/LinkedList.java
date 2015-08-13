package ch05.Assign03;

public class LinkedList
{
	private DNode headNode;
	
	public void insertAtHead( int data )
	{
		DNode newHead = new DNode( data );
		newHead.setNextNode(this.headNode);
		this.headNode = newHead;
	}

	public void insertAtTail( int data )
	{
		DNode current = this.headNode;

		if (current == null)
		{
			insertAtHead( data );
		}
		else {

			int ln = this.length();
			DNode newValue = new DNode(data);

			for (int i = 0 ; i < ln - 1 ; i++ )
			{
				current = current.getNextNode();
			}

			current.setNextNode(newValue);
			newValue.setPrevNode(current);
		}
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
