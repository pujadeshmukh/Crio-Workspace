package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.left.left = new TreeNode(5);
        tree.root.right.right = new TreeNode(6);
        tree.root.right.right.right = new TreeNode(7);
        tree.root.right.right.right.right = new TreeNode(8);

        List<Integer> list = getLeftView(tree.root);
        System.out.println(list);
    }

    private static List<Integer> getLeftView(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(i==0){
                    list.add(curr.data);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return list;
    }
}
