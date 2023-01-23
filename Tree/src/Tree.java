import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    /*  Prints the current node, then for each child makes a
        recursive call. Effectively, goes from:
        root -> level 1 child -> level 2 child -> lowest level child
     */
    public void depthFirstTraversal(TreeNode current) {
        System.out.print(current.data + " ");
        for (TreeNode child: current.children) {
            depthFirstTraversal(child);
        }
    }

    /*  Sets current == the first element in the queue.
        Prints this element.
        Adds all of the children to the queue.
        Effectively, goes from:
        root -> level 1 child -> level 1 child -> level 1 child -> level 2 child
     */
    public void breadthFirstTraversal() {
        TreeNode current = this.root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll(); // Returns and removes the element at the front.
            System.out.print(current.data + " ");
            queue.addAll(current.children);
        }
    }

    public void print() {
        print(this.root, 0);
    }

    public void print(TreeNode current, int level) {
        String levelMarks = "";
        for (int i = 0; i < level; i++) {
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }
}
