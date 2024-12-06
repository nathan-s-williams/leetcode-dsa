// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(String val) { this.val = parseTreeNodeVal(val); }
    TreeNode(String val, TreeNode left, TreeNode right) {
        this.val = parseTreeNodeVal(val);
        this.left = left;
        this.right = right;
    }

    private int parseTreeNodeVal(String val) {
        if (val == null) {
            return 0;
        }
        return Integer.parseInt(val);
    }
}
