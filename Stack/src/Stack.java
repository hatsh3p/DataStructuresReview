import java.util.LinkedList;

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
}
