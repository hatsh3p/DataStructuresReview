public class Main {
    public static void main(String[] args) {
        Stack pancakes = new Stack(3);
        pancakes.push("blueberry");
        pancakes.push("banana");
        pancakes.push("chocolate chip");
        pancakes.printList();
        //pancakes.push("stawberry");
        //pancakes.printList();
        System.out.println(pancakes.pop());
        pancakes.printList();
        System.out.println(pancakes.pop());
        pancakes.printList();
        System.out.println(pancakes.pop());
        pancakes.printList();
        //pancakes.pop();
    }

}
