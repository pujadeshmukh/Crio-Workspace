package Tree;

public class MaxDepth {
    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(4);
        //tree.preorderTraversal(tree.root);
        System.out.println("The maximum depth of tree is: "+getMaxDepth(tree.root));
    }

    private static int getMaxDepth(TreeNode root) {
        int leftDepth = 0;
        int rightDepth = 0;
        if(root == null){
            return 0;
        }
        leftDepth = getMaxDepth(root.left);
        rightDepth = getMaxDepth(root.right);

        return Math.max(leftDepth,rightDepth) + 1;

    }
}
