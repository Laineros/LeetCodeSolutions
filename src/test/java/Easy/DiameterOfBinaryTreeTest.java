package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiameterOfBinaryTreeTest {

    @Test
    public void testExample1() {
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }
    @Test
    public void testExample2() {
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(1, solution.diameterOfBinaryTree(root));
    }
}
