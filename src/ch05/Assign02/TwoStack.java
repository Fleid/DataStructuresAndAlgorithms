package ch05.Assign02;

public class TwoStack
{
	private int[] SA = new int[150];
	
	private int top1 = -1; // de 0 à 99
	private int top2 = 150; // de 149 à 100
	
	public void push1( int data )
	{
		if (top1 < 99) // on peut donc écrire jusqu'à 99 inclus
		{
			top1++;
			SA[top1] = data;
		}
		else throw new RuntimeException("First stack is full");
	}
	
	public void push2( int data )
	{
		if (top2 > 100) // on peut donc écrire jusqu'à 100 inclus
		{
			top2--;
			SA[top2] = data;
		}
		else throw new RuntimeException("Second stack is full");
	}
	
	public int peek1()
	{
		if (top1 == -1) throw new RuntimeException("First stack is empty");
		return SA[top1];
		
	}
	
	public int peek2()
	{
		if (top2 == 150) throw new RuntimeException("Second stack is empty");
		return SA[top2];
	}
	
	public int pop1()
	{
		if (top1 > -1)
		{
			int current = SA[top1];
			top1--;
			return current;
		}
		else throw new RuntimeException("First stack is empty");
		
	}
	
	public int pop2()
	{
		if (top2 < 150)
		{
			int current = SA[top2];
			top2++;
			return current;
		}		
		else throw new RuntimeException("Second stack is empty");
	}
	
	
}