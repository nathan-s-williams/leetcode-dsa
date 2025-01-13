public class MaxDiffBetweenNodeAndAncestor {
    int ans;
    public int getMaxDifference(TreeNode root) {
        ans = 0;
        helper(root, root.val, root.val);
        return ans;
    }

    void helper(TreeNode root, int max, int min) {
        if (root == null) {
            return;
        }

        int maxDiff = Integer.max(Math.abs(root.val - max), Math.abs(root.val - min));
        ans = Integer.max(ans, maxDiff);
        int newMax = Integer.max(root.val, max);
        int newMin = Integer.min(root.val, min);
        helper(root.left, newMax, newMin);
        helper(root.right, newMax, newMin);
    }

    public static void main(String[] args) {
        MaxDiffBetweenNodeAndAncestor sol = new MaxDiffBetweenNodeAndAncestor();
        BinaryTreeConstructor btc = new BinaryTreeConstructor();
        TreeNode tree =  btc.constructBinaryTree(new String[]{"8", "3", "10", "1", "6", null, "14", null, null, "4", "7", "13"});
//        TreeNode tree =  btc.constructBinaryTree(new String[]{"1",null,"2",null,"0","3"});
        System.out.println(sol.getMaxDifference(tree));
    }
}
