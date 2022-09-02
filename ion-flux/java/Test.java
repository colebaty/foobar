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

    public static void ioPrint(TreeNode node) {
        if (node == null)
            return;
        ioPrint(node.left);
        System.out.print(node.val + " ");
        ioPrint(node.right);
    }

    public static void poPrint(TreeNode node) {
        if (node == null)
            return;
        poPrint(node.left);
        poPrint(node.right);
        System.out.print(node.val + " ");
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

class Test {
    public static void main (String[] args) {
        int H = Integer.parseInt(args[0]);
        TreeNode root = BinaryTree.populate(H);

        BinaryTree.ioPrint(root);
        System.out.println();

        BinaryTree.postOrderLabel(root);
        BinaryTree.ioPrint(root);
        System.out.println();
        BinaryTree.poPrint(root);
        System.out.println();
    }
}
