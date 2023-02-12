public class TestTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(8);
        bst.root.left = new Node(3);
        bst.root.right = new Node(10);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(6);
        bst.root.right.right = new Node(14);

        System.out.println("Before delete: ");
        inOrderTraversal(bst.root);

        bst.deleteNode(bst.root, 10);

        System.out.println("\nAfter delete: ");
        inOrderTraversal(bst.root);
    }

    private static void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
}
