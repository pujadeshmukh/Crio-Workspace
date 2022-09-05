package Tree;

import java.util.*;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(4);
        List<Integer> ans = printReverseLevelOrderTraversal(tree.root);
        System.out.println(ans);
    }

    private static List<Integer> printReverseLevelOrderTraversal(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Integer> ansList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        q.add(root);
        while (!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.right != null){
                q.add(curr.right);
            }
            if(curr.left != null){
                q.add(curr.left);
            }
            stack.push(curr.data);
        }

        while (!stack.isEmpty()){
            ansList.add(stack.pop());
        }
        return ansList;
    }
}
