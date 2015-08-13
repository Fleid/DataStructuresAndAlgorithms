package ch05.Assign02;

public class TestTwoStack
{
	public static void main( String[] args )
	{
		TwoStack TS = new TwoStack();
		
		TS.push1(1);
		TS.push1(3);
		TS.push1(8);
		TS.push1(4);
		
		TS.push2(12);
		TS.push2(15);
		TS.push2(14);
		TS.push2(19);
		
		System.out.println("Pop1 : " + TS.pop1() + " ; Peek1 : " + TS.peek1());
		System.out.println("Pop2 : " + TS.pop2() + " ; Peek2 : " + TS.peek2());
		System.out.println("Pop1 : " + TS.pop1() + " ; Peek1 : " + TS.peek1());
		System.out.println("Pop2 : " + TS.pop2() + " ; Peek2 : " + TS.peek2());
		System.out.println("Pop1 : " + TS.pop1() + " ; Peek1 : " + TS.peek1());
		System.out.println("Pop2 : " + TS.pop2() + " ; Peek2 : " + TS.peek2());		
		System.out.println("Pop1 : " + TS.pop1() + " ; Peek1 : " + TS.peek1());
		System.out.println("Pop2 : " + TS.pop2() + " ; Peek2 : " + TS.peek2());
	}
}