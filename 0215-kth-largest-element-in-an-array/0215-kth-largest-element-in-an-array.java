class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int i : nums) {
            q.add(i);
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == k-1) {
                res = q.poll();
                break;
            }
            q.poll();
        }
        return res;
    }
}