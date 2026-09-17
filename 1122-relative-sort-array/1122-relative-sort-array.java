class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length];
        int index = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr2) {
            set.add(i);

            for (int j : arr1) {
                if (j == i) {
                    arr[index] = j;
                    index++;
                }
            }
        }

        int[] remaining = new int[arr1.length - index];
        int k = 0;

        for (int i : arr1) {
            if (!set.contains(i)) {
                remaining[k] = i;
                k++;
            }
        }

        Arrays.sort(remaining);

        for (int i : remaining) {
            arr[index] = i;
            index++;
        }

        return arr;
    }
}