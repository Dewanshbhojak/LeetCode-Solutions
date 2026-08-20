/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean dfs(TreeNode root, TreeNode node ,ArrayList<TreeNode> list){
        if(root == node){
            list.add(root);
            return true;
        }
        if(root==null)return false;
        if(dfs(root.left,node, list)) {
            list.add(root);
            return true;
        }
         if(dfs(root.right,node, list)) {
            list.add(root);
            return true;
        }

            return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();

        dfs(root,p,list1);
        dfs(root,q,list2);
        HashSet<TreeNode> set = new HashSet<>();
        for(TreeNode t : list1){
            set.add(t);
        }
         for(TreeNode t : list2){
            if(set.contains(t)){
                return t;
            }
           
        }
        return null;
    }
}