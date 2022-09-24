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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, new ArrayList<>(), 0, targetSum);
        return ans;
    }
    
    public void dfs(TreeNode n, List<Integer> temp, int sum, int targetSum) {
        if(n == null) return;
        
        sum += n.val;
        temp.add(n.val);
        if(n.left == null && n.right == null && sum == targetSum) {
            ans.add(new ArrayList(temp));
        }
        
        dfs(n.left, temp, sum, targetSum);
        dfs(n.right, temp, sum, targetSum);
        
        sum -= n.val;
        temp.remove(temp.size()-1);
    }
}