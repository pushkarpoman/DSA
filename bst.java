// Node class for BST
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

// Binary Search Tree class
class BinarySearchTree {
    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Insert a value into the BST
    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }

    // Inorder traversal (sorted order)
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Search for a value in the BST
    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert elements into BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Inorder traversal
        System.out.print("Inorder traversal: ");
        bst.inorder();
        System.out.println();

        // Search for elements
        int key = 40;
        if (bst.search(key))
            System.out.println(key + " found in BST.");
        else
            System.out.println(key + " not found in BST.");
    }
}
