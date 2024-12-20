package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //Add and Offer add new elements to the queue
        queue.add("John"); //Returns error exception if trying to add to a full queue
        queue.offer("Dorothy"); //Returns false if queue is full
        queue.offer("Nathaniel");
        queue.offer("Thomas");
        queue.offer("Ringo");

        //Peek and Element return the next element of the queue
        System.out.println(queue.peek()); //Returns null if queue is empty
        System.out.println(queue.element()); //Returns error exception if queue is empty
        
        System.out.println(queue.size());
        //queue.clear(); Empties the queue
        System.out.println(queue.isEmpty());

        //Pool and Remove remove the next element of the queue (FIFO)
        System.out.println(queue.poll()); //Returns null if queue is empty
        System.out.println(queue.remove()); //Returns error exception if queue is empty
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.isEmpty());
    }
}
