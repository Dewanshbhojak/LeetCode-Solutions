class Solution {
    public static int way(int[][] arr, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || visited[row][col]
            || arr[row][col] == 0)
            return 0;
        visited[row][col] = true;

        int top = way(arr, row - 1, col, visited);
        int down = way(arr, row + 1, col, visited);
        int left = way(arr, row, col - 1, visited);
        int right = way(arr, row, col + 1, visited);
        
        return 1 + top +down +left+ right;
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0 ;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 &&!visited[i][j] ) {
                   max = Math.max(max,way(grid,i,j,visited));
                }
            }
        }
        return max;
    }
}
