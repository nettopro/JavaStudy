package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExercise {
    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<String>();

        books.add("The Hobbit");
        books.push("Don Quixote");
        books.push("The Book");

        System.out.println(books.peek());
        System.out.println(books.element());

        for(String book : books){
            System.out.println(book);
        }

        System.out.println(books.pop());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.pop());
        System.out.println(books.remove());
    }
}
