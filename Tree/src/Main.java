public class Main {
    public static void main(String[] args) {
        TreeNode abraham = new TreeNode("Abraham");
        TreeNode herb = new TreeNode("Herb");
        TreeNode homer = new TreeNode("Homer");
        TreeNode lisa = new TreeNode("Lisa");

        Tree simpsons = new Tree(abraham);
        abraham.addChild(herb);
        abraham.addChild(homer);
        homer.addChild(lisa);
        homer.addChild("Bart");
        homer.addChild("Maggie");
        simpsons.print();

        homer.removeChild("Bart");
        simpsons.print();

        abraham.removeChild(herb);
        simpsons.print();

        homer.addChild("Bart");
        abraham.addChild("Herb");
        simpsons.print();

        simpsons.depthFirstTraversal(abraham);
        System.out.println();
        simpsons.breadthFirstTraversal();
    }
}
