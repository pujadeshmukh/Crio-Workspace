package Tree;

public class InvertABinaryTree {
    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        System.out.println("Pre-order traversal before inversion");
        tree.preorderTraversal(tree.root);
        inversion(tree.root);
        System.out.println();
        System.out.println("Pre-order traversal after inversion");
        tree.preorderTraversal(tree.root);
    }

    private static void inversion(TreeNode root) {
        if(root == null){
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        inversion(root.left);
        inversion(root.right);
    }


}
