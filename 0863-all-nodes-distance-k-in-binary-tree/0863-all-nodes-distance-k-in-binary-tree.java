/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 class Pair{
    int node;
    TreeNode parent;
    Pair(int node, TreeNode parent) {
        this.node = node;
        this.parent = parent;
    }
 }
class Solution {
   static int i = 0; 
    public static void way(TreeNode root,HashMap<TreeNode,Pair> map,List<Integer> list,boolean[] visited,int k) {
            if(k==0) {
                list.add(root.val);
                return;
            }
            Pair index = map.get(root);
            visited[index.node] = true;
            if(root.left !=null) {
                Pair n = map.get(root.left); 
                if(!visited[n.node])
            way(root.left,map,list,visited,k-1);
        }
        if(root.right !=null) {
            Pair n = map.get(root.right); 
                if(!visited[n.node])
           way(root.right,map,list,visited,k-1);
        }
        if(index.parent!=null) {
            Pair n = map.get(index.parent); 
                if(!visited[n.node])
            way(index.parent,map,list,visited,k-1);
        }
    }
    public static void find(TreeNode root, TreeNode target,HashMap<TreeNode,Pair> map) {
       
        if(root.left !=null) {
            i++;
            map.put(root.left, new Pair(i,root));
            find(root.left,target,map);
        }
        if(root.right !=null) {
            i++;
            map.put(root.right, new Pair(i,root));
            find(root.right,target,map);
        }

    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();
        HashMap<TreeNode,Pair> map = new HashMap<>();
        map.put(root,new Pair(i,null));
        
        find(root,target,map);
        boolean[] visited = new boolean[i+1];
        way(target, map,list,visited,k);
        return list;

    }
}