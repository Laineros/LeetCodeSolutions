package Easy.Trees;

public class DiameterOfBinaryTree {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepthModified(root);
        return maxDiameter;
    }

    private int maxDepthModified(TreeNode node) {
        if (node == null) return 0;
        int leftDepth = maxDepthModified(node.left);
        int rightDepth = maxDepthModified(node.right);
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
