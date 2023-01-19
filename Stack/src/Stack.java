import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Stack {
    LinkedList stack;
    int size;
    static int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(String data) {
        if (this.hasSpace()) {
            this.stack.addFirst(data);
            this.size++;
        } else {
            throw new Error("Stack is full!");
        }
    }

    public String pop() {
        if (!this.isEmpty()) {
            this.size--;
            return this.stack.removeFirst().toString();
        } else {
            throw new Error("Stack is empty!");
        }
    }

    public String peek() {
        if (!this.isEmpty()) {
            return this.stack.peek().toString();
        } else {
            return null;
        }
    }

    public void printList() {
        System.out.print("<top> ");
        List items = this.stack;
        System.out.print(items.toString());
        System.out.print(" <bottom>\n");

    }
}
