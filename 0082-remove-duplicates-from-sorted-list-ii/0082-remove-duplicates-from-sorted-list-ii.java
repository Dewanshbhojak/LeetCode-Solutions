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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode demo = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (demo != null) {
            ListNode node = demo.next;
            int count = 0;
            while (node != null && node.val == demo.val) {
                node = node.next;
                count++;
            }
            if (count == 0) {

                prev.next = demo;
                prev = demo;
            } else {

                prev.next = node;
            }

            demo = node;

        }
        return dummy.next;
    }
}