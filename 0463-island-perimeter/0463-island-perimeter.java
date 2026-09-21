class Solution {
    public int dfs(int[][] arr, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length ||  arr[i][j] == 0) {
            return 1;
        }
        if(visited[i][j]) return 0;
        visited[i][j]=true;
        int top = dfs(arr,i-1,j,visited);
        int down = dfs(arr,i+1,j,visited);
        int right = dfs(arr,i,j+1,visited);
        int left = dfs(arr,i,j-1,visited);
        return top + down+ right + left ;
    }

    public int islandPerimeter(int[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr[i].length;j++){
                    if(arr[i][j]==1) {
                        return dfs(arr,i,j,visited);
                    }
                }
            }
            return 0;
    }
}