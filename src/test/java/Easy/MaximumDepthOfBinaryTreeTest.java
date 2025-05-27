package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {
    @Test
    public void testEmptyTree() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = null;
        assertEquals(0, solution.maxDepth(root));
    }

    @Test
    public void testSingleNodeTree() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1);
        assertEquals(1, solution.maxDepth(root));
    }

    @Test
    public void testExample1() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    public void testExample2() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertEquals(2, solution.maxDepth(root));
    }

    @Test
    public void testUnbalancedTreeLeft() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    public void testUnbalancedTreeRight() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(3, solution.maxDepth(root));
    }
}
