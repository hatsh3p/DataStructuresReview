public class Node {
    private String data;
    private Node next;
    private Node previous;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPrevious(Node node) {
        this.previous = node;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public String getData() {
        return this.data;
    }

}
