import com.sun.source.tree.Tree;

import java.util.Dictionary;
import java.util.Map;

public class MaxDiffBetweenNodeAndAncestor {
    public int getMaxDifference(TreeNode root) {
        //compare each root with min max. If new min then make new min. Same with max. Then take diff and pass if greater.
        //Compare each min and max at each root with its left and right. Only one can have the min and/or max.

        return 0;
    }

    private Map<String, Integer> helper(TreeNode root, Map<String, Integer> map) {
        if (root == null) {
            return map;
        }

        Map<String, Integer> leftMap = helper(root.left, map);
        Map<String, Integer> rightMap = helper(root.right, map);
        int min = Integer.min(leftMap.get("min"), rightMap.get("min"));
        int max = Integer.max(leftMap.get("max"), rightMap.get("max"));

        return null;
    }

    public static void main(String[] args) {
        MaxDiffBetweenNodeAndAncestor sol = new MaxDiffBetweenNodeAndAncestor();
        BinaryTreeConstructor btc = new BinaryTreeConstructor();
        TreeNode tree =  btc.constructBinaryTree(new String[]{"8", "3", "10", "1", "6", null, "14", null, null, "4", "7", "13"});
        System.out.println(sol.getMaxDifference(tree));
    }
}
