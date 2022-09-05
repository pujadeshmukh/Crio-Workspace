package Tree;

import java.util.*;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(4);
        List<List<Integer>> ans = printLevelOrderTraversal(tree.root);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> printLevelOrderTraversal(TreeNode root){
        List<List<Integer>> ansList = new ArrayList<>();
        if(root == null){
            System.out.println("Empty tree");
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode curr = q.poll();

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                temp.add(curr.data);
            }
            ansList.add(temp);
        }
        return ansList;
    }
}
