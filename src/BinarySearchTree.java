public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node deleteNode(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value < current.data) {
            current.left = deleteNode(current.left, value);
        } else if (value > current.data) {
            current.right = deleteNode(current.right, value);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteNode(current.right, smallestValue);
        }

        return current;
    }

    private int findSmallestValue(Node node) {
        return node.left == null ? node.data : findSmallestValue(node.left);
    }
}