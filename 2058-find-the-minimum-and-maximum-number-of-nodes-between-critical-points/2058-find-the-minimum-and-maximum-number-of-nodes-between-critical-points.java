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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node = head;
        int n = 0;
        int prev = 0;
        while (node != null) {
            if (n == 0) {
                prev = node.val;
                node = node.next;
                n++;
                continue;
            }

            if (node.val < prev && node.next != null && node.val < node.next.val) {
                list.add(n);
            } else if (node.val > prev && node.next != null && node.val > node.next.val) {
                list.add(n);
            }
            prev = node.val;
            node = node.next;
            n++;

        }

        if (list.size() == 0|| list.size()==1) {
            return new int[] { -1, -1 };
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        max = list.get(list.size() - 1) - list.get(0);
        return new int[] { min, max };
    }
}