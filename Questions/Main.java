class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class FlipEquivalent {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // Base case: both nodes are null
        if (root1 == null && root2 == null) return true;
        // If one is null and the other is not
        if (root1 == null || root2 == null) return false;
        // If the values of the nodes are different
        if (root1.val != root2.val) return false;

        // Check both configurations
        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) ||
               (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two sample trees
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

        // Create an instance of FlipEquivalent
        FlipEquivalent solution = new FlipEquivalent();
        
        // Check if the trees are flip equivalent
        boolean result = solution.flipEquiv(root1, root2);
        System.out.println("Are the trees flip equivalent? " + result);
    }
}
