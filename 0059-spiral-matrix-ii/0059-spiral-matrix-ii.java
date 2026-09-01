class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0;
        int left = 0;
        int right = arr[0].length - 1;
        int down = arr.length - 1;
        int val = 1;
        while (val <= n * n) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = val;
                val++;
            }
            top++;
            for (int i = top; i <= down; i++) {
                arr[i][right] = val;

                val++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                arr[down][i] = val;

                val++;
            }
            down--;
            for (int i = down; i >= top; i--) {
                arr[i][left] = val;

                val++;
            }
            left++;
        }
        return arr;
    }
}