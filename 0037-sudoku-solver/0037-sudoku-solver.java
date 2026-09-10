class Solution {
    public boolean check(char[][] arr, char val, int row, int col) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == val) {
                return false;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[row][i] == val) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (arr[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean dfs(char[][] arr){
        for(int i  = 0 ;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++) {
                if(arr[i][j]=='.')
                {   char ch ='1';
                    while(ch<='9'){
                       if(check(arr,ch,i,j)){
                        arr[i][j]=ch;
                        if(dfs(arr)) return true;
                        arr[i][j]='.';
                       }
                       ch++;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] arr) {
            dfs(arr);
    }
}