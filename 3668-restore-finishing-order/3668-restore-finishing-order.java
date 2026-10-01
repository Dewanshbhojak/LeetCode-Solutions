class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for (int i : friends) {
            set.add(i);
        }
        int index = 0;
        for (int i : order) {
            if (set.contains(i)) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
}