/**
 * Created by issacholguin1 on 7/25/18.
 */
public class Tree {
    public class Node {
        private int data;
        private Node left, right;

        public Node (int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;

    public Tree (int data) {
        root = new Node(data);
    }

    public void insert(int data) {
        Node n = recursiveInsert(root, data);
    }

    private Node recursiveInsert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (root.data < data) {
            root.right = recursiveInsert(root.right, data);
        } else if (root.data > data) {
            root.left = recursiveInsert(root.left, data);
        }

        return root;
    }

    public void printTree() {
        printTreeRecursively(root);
    }

    private void printTreeRecursively(Node root) {
        if (root != null) {
            printTreeRecursively(root.left);
            System.out.println(root.data);
            printTreeRecursively(root.right);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(40);
        tree.insert(25);
        tree.insert(78);
        tree.insert(10);
        tree.insert(32);





        tree.printTree();

    }


}

// insert(2)
//   5
// *  *