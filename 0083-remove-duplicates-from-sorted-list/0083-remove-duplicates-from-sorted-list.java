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
            while(demo!=null){
                if(demo.next!=null && demo.val == demo.next.val){
                    demo.next = demo.next.next;
                }else
                demo = demo.next;
            }
            return head;
    }
}