public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(Node node) {
        if (this.head == null) {
            this.head = this.tail = node;
            return;
        }

        Node oldHead = this.head;
        Node newHead = node;
        newHead.setNext(oldHead);
        oldHead.setPrevious(newHead);
        this.head = newHead;
    }

    public void addToTail(Node node) {
        if (this.head == null) {
            this.head = this.tail = node;
            return;
        }

        Node oldTail = this.tail;
        Node newTail = node;
        oldTail.setNext(newTail);
        newTail.setPrevious(oldTail);
        this.tail = newTail;
    }

    public Node removeHead() {
        if (this.head == null) {
            return null;
        }

        Node oldHead = this.head;
        if (oldHead.getNext() == null) {
            this.head = this.tail = null;
        }

        Node newHead = oldHead.getNext();
        newHead.setPrevious(null);
        this.head = newHead;

        return oldHead;
    }

    public Node removeTail() {
        if (this.head == null) {
            return null;
        }

        Node oldTail = this.tail;
        if (oldTail.getPrevious() == null) {
            this.head = this.tail = null;
        }

        Node newTail = oldTail.getPrevious();
        newTail.setNext(null);
        this.tail = newTail;
        return oldTail;
    }

    public Node removeByData(String data) {
        if (this.head == null) {
            return null;
        }

        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.getData() == data) {
                break;
            }
            currentNode = currentNode.getNext();
        }

        Node previous = currentNode.getPrevious();
        Node next = currentNode.getNext();
        previous.setNext(next);
        next.setPrevious(previous);
        return currentNode;
    }

    public void printList() {
        System.out.print("[");
        Node currentNode = this.head;

        while (currentNode.getNext() != null) {
            System.out.printf("%s, ", currentNode.getData());
            currentNode = currentNode.getNext();
        }

        if (currentNode != null) {
            System.out.printf("%s", currentNode.getData());
        }

        System.out.print("]\n");
    }
}
