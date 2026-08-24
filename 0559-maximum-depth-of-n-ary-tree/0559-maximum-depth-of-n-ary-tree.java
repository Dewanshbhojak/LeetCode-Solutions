/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int dfs(Node root) {
        if(root==null) return 0;
        if(root.children.size()==0) return 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<root.children.size();i++) {
            Node n = root.children.get(i);
            int res = dfs(n);
            max = Math.max(max,res);

        }
        return max+1;
    }
    public int maxDepth(Node root) {
        return dfs(root);
    }
}