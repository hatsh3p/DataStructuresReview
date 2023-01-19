import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Queue {
    LinkedList queue;
    int size;
    // Initially, had a compilation error b/c I didn't add the static keyword.
    // DEFAULT_MAX_SIZE was being treated as an instance field so it could not be accessed before
    // the instance was created.
    static int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(String data) {
        if (this.hasSpace()) {
            this.queue.addFirst(data);
            this.size++;
        } else {
            throw new Error("Queue is full!");
        }
    }

    public String dequeue() {
        if (!this.isEmpty()) {
            this.size--;
            return this.queue.removeFirst().toString();
        } else {
            throw new Error("Queue is empty!");
        }
    }

    public String peek() {
        if (!this.isEmpty()) {
            return this.queue.peek().toString();
        } else {
            return null;
        }
    }

    public void printList() {
        System.out.print("<first> ");
        List items = this.queue;
        Collections.reverse(items);
        System.out.print(items.toString());
        System.out.print(" <last>\n");

    }
}
