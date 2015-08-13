package ch05.Assign03;

/**
 * Created by Fleid on 13/08/2015.
 */
public class TestQueue
{
    public static void main( String[] args )
    {
        Queue Q = new Queue();

        Q.enqueue(3);
        Q.enqueue(7);
        Q.enqueue(12);
        Q.enqueue(29);

        System.out.println("Peek : " + Q.peek());
        System.out.println("Pop : " + Q.dequeue());
        System.out.println("Pop : " + Q.dequeue());
        System.out.println("Pop : " + Q.dequeue());
        Q.enqueue(45);

        System.out.println("Pop : " + Q.dequeue());
        System.out.println("Pop : " + Q.dequeue());
    }
}
