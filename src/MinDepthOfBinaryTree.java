import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collection;

public class MinDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return right + 1;
        } else if (root.right == null) {
            return left + 1;
        } else {
            return Integer.min(left, right) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeConstructor btc = new BinaryTreeConstructor();
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
//        Integer[] arr = {2, null, 3, null, 4, null, 5, null, 6};
        TreeNode root = btc.constructBinaryTree(arr);
        MinDepthOfBinaryTree sol = new MinDepthOfBinaryTree();
        System.out.println(sol.minDepth(root));
//        BinaryTreeConstructor.printLevelOrder(root);
//        if (root.left.right == null) {
//            System.out.println("null");
//        } else {
//            System.out.println(root.left.right.val);
//        }
    }
}
