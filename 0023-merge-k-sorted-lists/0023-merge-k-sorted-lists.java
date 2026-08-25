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
        ArrayList<Integer> list = new ArrayList<>();
        ListNode res = new ListNode();
        ListNode dummy = res;
        for(int i = 0;i<lists.length;i++) {
            ListNode node = lists[i];
                while(node!=null) {
                    list.add(node.val);
                    node=node.next;
                }
        }
        Collections.sort(list);
       for(int i : list) {
            res.next = new ListNode(i);
            res= res.next;
       }
        return dummy.next;
    }
}