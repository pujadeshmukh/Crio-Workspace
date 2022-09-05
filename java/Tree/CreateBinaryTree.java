package Tree;

public class CreateBinaryTree {
    TreeNode root;
    CreateBinaryTree(int key){
        root = new TreeNode(key);
    }
    CreateBinaryTree(){
        root = null;
    }

    public static void preorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        preorderTraversal(tree.root);
    }
}
