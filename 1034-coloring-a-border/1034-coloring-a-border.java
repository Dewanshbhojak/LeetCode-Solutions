class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int[][] colorBorder(int[][] arr, int row, int col, int color) {
        int target = arr[row][col];
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int[][] original = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                original[i][j] = arr[i][j];
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(row, col));
        while (!queue.isEmpty()) {
            Pair p = queue.remove();
            int i = p.row;
            int j = p.col;
            visited[i][j] = true;
            if (i == 0 || j == 0 || i == arr.length - 1 || j == arr[0].length - 1 || original[i - 1][j] != target
                    || original[i + 1][j] != target || original[i][j - 1] != target || original[i][j + 1] != target) {
                arr[i][j] = color;
            }
            if (i - 1 >= 0 && !visited[i - 1][j] && arr[i - 1][j] == target) {
                queue.add(new Pair(i - 1, j));
            }
            if (i + 1 < arr.length && !visited[i + 1][j] && arr[i + 1][j] == target) {
                queue.add(new Pair(i + 1, j));
            }
            if (j - 1 >= 0 && !visited[i][j - 1] && arr[i][j - 1] == target) {
                queue.add(new Pair(i, j - 1));
            }
            if (j + 1 < arr[0].length && !visited[i][j + 1] && arr[i][j + 1] == target) {
                queue.add(new Pair(i, j + 1));
            }

        }
        return arr;
    }
}