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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while(node!=null){
            list.add(node);
            node = node.next;
        }
        int i = 0;
        while(i<list.size() && i+k<=list.size()) {
            int j = i;
            int m = i+k-1;
            while(j<=m) {
                ListNode n = list.get(j);
                list.set(j,list.get(m));
                list.set(m,n);
                j++;
                m--;
            }
            i = i+k;
        }
        ListNode res = new ListNode();
        ListNode dummy = res;
        for(ListNode m : list) {
            dummy.next = m;
            dummy = dummy.next;
        }
        dummy.next=null;
        return res.next;
    }
}