package invert_binary_tree;


/*
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
 */
public class Solution {

    public static void main(String[] args) {

        TreeNode tr1 = new TreeNode(1);
        TreeNode tr3 = new TreeNode(3);
        TreeNode tr2 = new TreeNode(2,tr1,tr3);
        TreeNode tr6 = new TreeNode(6);
        TreeNode tr9 = new TreeNode(9);
        TreeNode tr7 = new TreeNode(7,tr6,tr9);

        TreeNode root1 = new TreeNode(4,tr2,tr7);
        TreeNode treeNode = invertTree(root1);
        System.out.println("Inverted tree root: " + treeNode.val);

    }
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
}
