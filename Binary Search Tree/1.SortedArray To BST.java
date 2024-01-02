class Soluton {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,6,9,15,22,35,40};
        TreeNode ans = sortedArrayToBST(nums);
        preOrder(ans);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return CreatBST(nums, 0, nums.length -1);
    }
    public static TreeNode CreatBST(int[] nums, int l, int r) {
        if (l < r) return null;
        int mid = l + (r - l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = CreatBST(nums, l, mid +1);
        root.right = CreatBST(nums, mid +1, r);
        return root;
    }
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}