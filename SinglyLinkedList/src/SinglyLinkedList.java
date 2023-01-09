public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addToHead(Node node) {
        Node currentHead = this.head;
        if (currentHead != null) {
            node.setNext(currentHead);
        }
        this.head = node;
    }

    public void addToTail(Node node) {
        Node currentNode = this.head;
        if (currentNode == null) {
            this.head = node;
            return;
        }
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(node);
    }

    public Node removeHead() {
        if (this.head == null) {
            return null;
        }
        Node newHead = this.head.getNext();
        Node removedHead = this.head;
        this.head = newHead;
        return removedHead;
    }

    public Node removeTail() {
        if (this.head == null) {
            return null;
        }
        Node removedNode;
        if (this.head.getNext() == null) {
            removedNode = this.head;
            this.head = null;
            return removedNode;
        }

        Node currentNode = this.head;
        while ((currentNode.getNext().getNext()) != null) {
            currentNode = currentNode.getNext();
        }
        removedNode = currentNode.getNext();
        currentNode.setNext(null);
        return removedNode;
    }

    public boolean removeByData(String data) {
        if (this.head == null) {
            return false;
        }

        Node currentNode = this.head;
        Node previousNode = null;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                if (previousNode != null) {
                    previousNode.setNext(currentNode.getNext());
                }
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public void printList() {
        System.out.print("<head> ");
        Node currentNode = this.head;

        while (currentNode != null) {
            System.out.printf("[%s] ", currentNode.getData());
            currentNode = currentNode.getNext();
        }
        System.out.print("<tail>\n");
    }
}
