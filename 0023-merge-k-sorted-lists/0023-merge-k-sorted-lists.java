/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node : lists){
            if(node!=null) {
                queue.add(node);
            }
        }
        ListNode res = new ListNode();
        ListNode curr = res;
        while(!queue.isEmpty()) {
                ListNode node = queue.poll();
                curr.next = node;
                curr=curr.next;
                if(node.next!=null) {
                    queue.offer(node.next);
                }
        }
        return res.next;
    }
}