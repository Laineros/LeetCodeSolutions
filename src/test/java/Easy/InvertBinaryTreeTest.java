package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvertBinaryTreeTest {
    @Test
    public void testInvertTreeExample1() {
        // Input: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Expected output: [4,7,2,9,6,3,1]
        TreeNode inverted = new InvertBinaryTree().invertTree(root);

        assertEquals(4, inverted.val);
        assertEquals(7, inverted.left.val);
        assertEquals(2, inverted.right.val);
        assertEquals(9, inverted.left.left.val);
        assertEquals(6, inverted.left.right.val);
        assertEquals(3, inverted.right.left.val);
        assertEquals(1, inverted.right.right.val);
    }

    @Test
    public void testInvertTreeExample2() {
        // Input: [2,1,3]
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        // Expected output: [2,3,1]
        TreeNode inverted = new InvertBinaryTree().invertTree(root);

        assertEquals(2, inverted.val);
        assertEquals(3, inverted.left.val);
        assertEquals(1, inverted.right.val);
    }

    @Test
    public void testInvertTreeExample3() {
        // Input: []
        TreeNode root = null;

        // Expected output: []
        TreeNode inverted = new InvertBinaryTree().invertTree(root);

        assertNull(inverted);
    }
}
