package ch05.Assign01;

public class TestStack
{
	public static void main( String[] args )
	{
		Stack S = new Stack();
		
		S.push(5);
		S.push(10);
		S.push(7);
		
		System.out.println("Peek : " + S.peek() );
		System.out.println("Pop : " + S.pop() + " - and then Peek : " + S.peek() );
		System.out.println("Pop : " + S.pop() + " - and then Peek : " + S.peek() );
		System.out.println("Pop : " + S.pop() + " - and then Peek : " + S.peek() );
		System.out.println("Pop : " + S.pop() + " - and then Peek : " + S.peek() );
			
	}
}