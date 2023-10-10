class Solution {
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root)[1];
    }
    
    public int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0, Integer.MIN_VALUE};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int first = Math.max(0, Math.max(left[0], right[0])) + root.val;
        int sec = Math.max(root.val + left[0] + right[0], Math.max(first, Math.max(left[1], right[1])));
        return new int[]{first, sec};
    }
}
