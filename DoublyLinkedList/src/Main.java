public class Main {
    public static void main(String[] args) {
        DoublyLinkedList icons = new DoublyLinkedList();
        Node hafez = new Node("Abdel Halim Hafez");
        Node parton = new Node("Dolly Parton");
        Node kulthum = new Node("Umm Kulthum");
        Node diana = new Node("Princess Diana");
        Node hosni = new Node("Suad Hosni");
        Node hamama = new Node("Faten Hamama");

        icons.addToHead(hafez);
        icons.addToTail(parton);
        icons.addToTail(kulthum);
        icons.printList();

        icons.removeHead();
        icons.printList();
        icons.removeTail();
        icons.printList();

        icons.addToTail(diana);
        icons.addToHead(hosni);
        icons.addToTail(hamama);
        icons.printList();
        icons.removeByData("Dolly Parton");
        icons.printList();


    }
}
