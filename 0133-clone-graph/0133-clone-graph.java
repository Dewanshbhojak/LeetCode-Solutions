/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node ==  null)  return null;
        
        HashMap<Node,Node> m = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        
        m.put(node,new Node(node.val));
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            List<Node> neighbors = n.neighbors;
            for (Node n1 : neighbors) {
              
            if(!m.containsKey(n1)) {
              
                    m.put(n1 , new Node(n1.val));
                    queue.offer(n1);
                }
            }
        }
       
        for(Node n : m.keySet()) {
            ArrayList<Node> l1 = new ArrayList<>();
            for(Node n1 : n.neighbors){
                l1.add(m.get(n1));
            }
         m.get(n).val =  n.val;
         m.get(n).neighbors = l1;

        }
        Node res = m.get(node);
        return res;
    }
}