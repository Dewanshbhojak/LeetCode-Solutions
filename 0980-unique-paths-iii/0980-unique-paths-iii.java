class Solution {
    public int dfs(int[][] arr, int row, int col,
               boolean[][] visited, int count) {

    if (row < 0 || col < 0 ||
        row >= arr.length || col >= arr[0].length ||
        arr[row][col] == -1 ||
        visited[row][col]) {
        return 0;
    }

    if (arr[row][col] == 2) {
        if (count == 0)
            return 1;
        return 0;
    }

    visited[row][col] = true;

    int newCount = count;

    if (arr[row][col] == 0) {
        newCount--;
    }

    int down = dfs(arr, row + 1, col, visited, newCount);
    int top = dfs(arr, row - 1, col, visited, newCount);
    int right = dfs(arr, row, col + 1, visited, newCount);
    int left = dfs(arr, row, col - 1, visited, newCount);

    visited[row][col] = false;

    return down + top + right + left;
}

    public int uniquePathsIII(int[][] arr) {
        int row = 0;
        int col = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    row = i;
                    col=j;
                }
                if(arr[i][j]==0) count++;
            }
        }
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        return dfs(arr,row,col,visited,count);
    }
}