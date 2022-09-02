package Solution;

import java.util.*;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class BinaryTree {
    public static TreeNode BinaryTree(int depth)
    {
        if (depth == 0)
            return new TreeNode(0);

        Queue<TreeNode> queue = new LinkedList<>();

        int i = 0;
        TreeNode root = new TreeNode(i);

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            i++;

            if (i > depth) {
                break;
            }
            else
            {
                for (int j = 0; j < size; j++) { 
                    TreeNode node = queue.remove();
                    node.left = new TreeNode(i);
                    node.right = new TreeNode(i);

                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }

        return root;

    }

    public static void ioPrint(TreeNode node) {
        if (node == null)
            return;
        ioPrint(node.left);
        System.out.print(node.val + " ");
        ioPrint(node.right);
    }
}

public class Solution {
    public static int[] solution(int h, int[] q) {
        int[] sol = new int[]{1, 2, 3};
        return sol;
        
    }

}
