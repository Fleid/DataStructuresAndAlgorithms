package ch05.Assign03;

/**
 * Created by Fleid on 13/08/2015.
 */

/**
 * Implement a queue using a linked list as an underlying data structure
 */

public class Queue
{
    // Ici on doit initialiser l'objet pour pouvoir l'utiliser
    // A mon avis parce que LinkedList n'a pas de constructeur, mais pas sur
    private LinkedList LL = new LinkedList();


    // enqueue (push at the tail)
    // dequeue (pop from the head)
    // peek (from the head)

    public void enqueue( int data )
    {
        this.LL.insertAtTail(data);
    }

    public int dequeue()
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
