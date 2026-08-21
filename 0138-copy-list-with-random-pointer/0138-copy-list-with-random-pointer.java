/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node res = null;
        Node demo = null;
        Node curr = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (curr != null) {
            res = new Node(curr.val);
            map.put(curr, res);

            if (demo == null) {
                demo = res;
            }
            res = res.next;
            curr = curr.next;

        }
        curr = head;
        while (curr != null) {
            Node node = map.get(curr);
            node.random = map.get(curr.random);
            node.next = map.get(curr.next);
            curr = curr.next;
        }
        return demo;
    }
}