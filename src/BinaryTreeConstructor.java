import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeConstructor {

    // Function to construct binary tree from array
    public TreeNode constructBinaryTree(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (index < array.length) {
            TreeNode currentNode = queue.poll();

            if (array[index] != null) {
                currentNode.left = new TreeNode(array[index]);
                queue.add(currentNode.left);
            }
            index++;

            if (index < array.length && array[index] != null) {
                currentNode.right = new TreeNode(array[index]);
                queue.add(currentNode.right);
            }
            index++;
        }

        return root;
    }

    // Main method for testing
    /*public static void main(String[] args) {
        BinaryTreeConstructor btc = new BinaryTreeConstructor();

        // Example 1
        Integer[] array1 = {3, 9, 20, null, null, 15, 7};
        TreeNode root1 = btc.constructBinaryTree(array1);
        printTree(root1); // Custom method to print the tree

        // Example 2
        Integer[] array2 = {2, null, 3, null, 4, null, 5, null, 6};
        TreeNode root2 = btc.constructBinaryTree(array2);
        printTree(root2); // Custom method to print the tree
    }*/

    // Helper method to print the tree (in-order traversal)
    public static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }
}