class Solution {
    public int way(int i, int j, int[][] arr, int prev, int[][] dp) {
        if (prev >= arr[i][j])
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        int top = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        if (i - 1 >= 0) {
            top = way(i - 1, j, arr, arr[i][j], dp);
        }
        if (j - 1 >= 0) {
            right = way(i, j - 1, arr, arr[i][j], dp);
        }
        if (i + 1 < arr.length) {
            down = way(i + 1, j, arr, arr[i][j], dp);
        }
        if (j + 1 < arr[0].length) {
            left = way(i, j + 1, arr, arr[i][j], dp);
        }
        return dp[i][j] = (int) ((1L + top + down + left + right) % 1000000007);
    }

    public int countPaths(int[][] arr) {
        long res = 0;
        int[][] dp = new int[arr.length][arr[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 res = (res + way(i, j, arr, -1, dp)) % 1000000007;
            }
        }
        return (int) res % 1000000007;
    }
}