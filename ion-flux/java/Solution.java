import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    public static void find(TreeNode node, int target, int parent, ArrayList<Integer> sol) {
        if (node == null)
            return;

        if (node.val == target) {
            sol.add(parent);
        }
        else {
            find(node.left, target, node.val, sol);
            find(node.right, target, node.val, sol);
        }
    }

    public static TreeNode populate(int depth)
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

    public static void postOrderLabel(TreeNode node) {
        if (node == null)
            return;

        postOrderLabel(node.left);
        postOrderLabel(node.right);

        node.val = nextLabel();

    }


    private static int labelStart = 1;
    private static int nextLabel() {
        return labelStart++;
    }
}

public class Solution {
    public static int[] solution(int h, int[] q) {
        /*
         * specs say 1 <= h <= 30
         * tree built with 0 <= h <= 29
         */
        TreeNode root = BinaryTree.populate(h - 1);

        BinaryTree.postOrderLabel(root);
        
        ArrayList<Integer> sol = new ArrayList<Integer>(q.length);
        for (int i = 0; i < q.length; i++) {
            BinaryTree.find(root, q[i], -1, sol);
        }

        int solArr[] = new int[sol.size()];
        for (int i = 0; i < sol.size(); i++) {
            solArr[i] = sol.get(i);
        }

        return solArr;

    }
}
