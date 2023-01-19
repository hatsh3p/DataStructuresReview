public class Main {
    public static void main(String[] args) {
        Queue candyConveyorBelt = new Queue();
        candyConveyorBelt.enqueue("truffles");
        candyConveyorBelt.enqueue("candy canes");
        candyConveyorBelt.enqueue("caramel chews");
        candyConveyorBelt.printList();
        candyConveyorBelt.dequeue();
        candyConveyorBelt.printList();
        System.out.println(candyConveyorBelt.peek());
        candyConveyorBelt.dequeue();
        candyConveyorBelt.dequeue();
        candyConveyorBelt.printList();
        System.out.println(candyConveyorBelt.peek());
        candyConveyorBelt.printList();
    }
}
