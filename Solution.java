class Solution {
    public int rob(TreeNode root) {
	int res1 = robFrom(root, true), res2 = robFrom(root, false);
	return Math.max(res1, res2);
    }

    private int robFrom(TreeNode node, Boolean canBeRobbed) {
	if (node == null)
	    return 0;
	else {
	    if (canBeRobbed) {
		return node.val+robFrom(node.left, false)+robFrom(node.right, false);
	    }
	    else {
		return robFrom(node.left, true)+robFrom(node.right, true);
	    }
	}
    }

    public static void main(String[] args) {
	// TreeNode root = new TreeNode(3);
	// root.left = new TreeNode(2);
	// root.right = new TreeNode(3);
	// root.left.right = new TreeNode(3);
	// root.right.right = new TreeNode(1);

	TreeNode root = new TreeNode(3);
	root.left = new TreeNode(4);
	root.right = new TreeNode(5);
	root.left.left = new TreeNode(1);
	root.left.right = new TreeNode(3);
	root.right.right = new TreeNode(1);

	Solution soln = new Solution();
	int maxmoney = soln.rob(root);
	System.out.println("The maximum amount of money can be robbed is:");
	System.out.println(maxmoney);
    }
};
