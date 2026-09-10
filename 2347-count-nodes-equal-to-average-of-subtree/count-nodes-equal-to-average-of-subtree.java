/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res = 0;
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return res;
    }
    int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        int sum = left + right + root.val;
        int count = Count(root);
        if(root.val == sum/count){
            res++;
        }

        return sum;
    }
    int Count(TreeNode root){
        if(root == null) return 0;
        return Count(root.left)+Count(root.right)+1;
    }
        
    }
