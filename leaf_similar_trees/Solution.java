package leaf_similar_trees;

import java.util.ArrayList;
import java.util.List;

/**
   Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
 */
public class Solution {

    public static void main(String[] args) {
// root1 = [3,5,1,6,2,9,8,null,null,7,4]
// root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
        TreeNode tr7 = new TreeNode(7);
        TreeNode tr4 = new TreeNode(4);
        TreeNode tr2 = new TreeNode(2,tr7,tr4);
        TreeNode tr6 = new TreeNode(6);
        TreeNode tr5 = new TreeNode(5,tr6,tr2);
        TreeNode tr9 = new TreeNode(9);
        TreeNode tr8 = new TreeNode(8);
        TreeNode tr1 = new TreeNode(1,tr9,tr8);

        TreeNode trr6 = new TreeNode(6);
        TreeNode trr7 = new TreeNode(7);
        TreeNode trr5 = new TreeNode(5,trr6,trr7);
        TreeNode trr9 = new TreeNode(9);
        TreeNode trr8 = new TreeNode(8);
        TreeNode trr2 = new TreeNode(2,trr9,trr8);
        TreeNode trr4 = new TreeNode(4);
        TreeNode trr1 = new TreeNode(1,trr4,trr2);

        TreeNode root1 = new TreeNode(3,tr5,tr1);
        TreeNode root2 = new TreeNode(3,trr5,trr1);

        leafSimilar(root1,root2);
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> listRoot1  = new ArrayList<>();
        List<Integer> listRoot2  = new ArrayList<>();
        traversePreOrder(root1,listRoot1);
        traversePreOrder(root2,listRoot2);
        return listRoot1.equals(listRoot2);
    }

    public static List<Integer> traversePreOrder(TreeNode node, List<Integer> list) {
        if (node != null) {
            visit(node, list);
            traversePreOrder(node.left, list);
            traversePreOrder(node.right, list);
        }
        return list;
    }

    public static void visit(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null ) {
            list.add(node.val);
        }
    }
}
