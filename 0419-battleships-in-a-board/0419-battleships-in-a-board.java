
class Solution {
    public static void dfs(char[][] arr,  boolean[][] visited, int row, int col) {
        if(row<0|| col<0 || row>=arr.length||col>=arr[0].length|| visited[row][col] || arr[row][col] == '.'){
            return ;
        }
        visited[row][col]= true;
        dfs(arr,visited,row+1,col);
        dfs(arr,visited,row-1,col);
        dfs(arr,visited,row,col+1);
        dfs(arr,visited,row,col-1);
    }
    public int countBattleships(char[][] arr) {
        int count = 0;
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        for(int i = 0; i<arr.length;i++) {
            for(int j = 0; j<arr[0].length;j++) {
                if(arr[i][j]== 'X' && !visited[i][j]) {
                    dfs(arr,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}