public class isValidBinaryTree {
    public boolean isValidBST(TreeNode root) {
        return(isBST(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    private boolean isBST(TreeNode root, long min, long max) {
        System.out.println(root.val+" "+min+" "+max);

        boolean left;
        if (root.left == null) {
            left = true;
        } else if (root.left.val < root.val && root.left.val > min) {
            left = isBST(root.left, min, root.val);
        } else {
            return(false);
        }

        boolean right;
        if (root.right == null) {
            right = true;
        } else if (root.right.val > root.val && root.right.val < max) {
            right = isBST(root.right, root.val, max);
        } else {
            return(false);
        }

        return(left && right);
    }

    public static void main(String[] args) {
        // System.out.println(new isValidBinaryTree().isValidBST(new TreeNode(5,
        //                                                       new TreeNode(4), new TreeNode(6,
        //                                                                            new TreeNode(3), new TreeNode(7)))));
        System.out.println(new isValidBinaryTree().isValidBST(new TreeNode(-2147483648,
                                                              null, new TreeNode(2147483647))));
    }
}

