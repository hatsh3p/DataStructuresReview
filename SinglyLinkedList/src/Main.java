import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Playing with my linked list implementation
        Node banana = new Node("banana");
        Node caramel = new Node("caramel");
        Node vanilla = new Node("vanilla ice cream");
        Node sugar = new Node("powdered sugar");
        Node cream = new Node("whipped cream");
        Node fudge = new Node("chocolate fudge");
        Node cinnamon = new Node("cinnamon");

        SinglyLinkedList dessert = new SinglyLinkedList();
        dessert.addToHead(banana);
        dessert.printList();
        dessert.addToTail(caramel);
        dessert.printList();
        dessert.removeByData("chocolate");
        dessert.addToHead(vanilla);
        dessert.printList();
        dessert.removeHead();
        dessert.removeTail();
        dessert.removeHead();
        dessert.printList();
        dessert.addToTail(sugar);
        dessert.addToTail(cream);
        dessert.printList();
        dessert.removeTail();
        dessert.addToTail(fudge);
        dessert.addToTail(cinnamon);
        dessert.removeByData("cinnamon");
        dessert.removeByData("powdered sugar");
        dessert.removeByData("chocolate fudge");
        dessert.printList();

        // Playing with Java's linked list implementation
        LinkedList<String> stew = new LinkedList<>();
        stew.add("beef chunk"); // adds to tail
        System.out.println(stew);
        stew.add("onion");
        System.out.println(stew);
        stew.addFirst("celery"); // adds to head
        System.out.println(stew);
        stew.remove(); // removes the head
        System.out.println(stew);
        stew.addLast("garlic");
        System.out.println(stew);
        stew.remove("onion"); // removes by data
        System.out.println(stew);
    }
}
