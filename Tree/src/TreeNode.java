import java.util.ArrayList;

public class TreeNode {
    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(Object data) {
        this.children.add(new TreeNode(data));
    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public void removeChild(Object data) {
        // No children to remove.
        if (this.children.isEmpty()) {
            return;
        }
        // Check if any of the children hold the data and remove.
        for (TreeNode child: this.children) {
            if (child.data == data) {
                removeChild(child);
                return;
            }
        }
        // Check the children of each child.
        for (TreeNode child: this.children) {
            child.removeChild(data);
        }
    }

    public void removeChild(TreeNode node) {
        if (this.children.isEmpty()) {
            return;
        } else if (this.children.contains(node)) {
            this.children.remove(node);
            return;
        } else {
            for (TreeNode child : this.children) {
                child.removeChild(node);
            }
        }
    }

}
