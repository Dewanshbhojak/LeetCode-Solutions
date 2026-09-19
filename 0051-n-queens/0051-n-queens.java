class Solution {
    public boolean way(char[][] arr, int row, int col) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == 'Q')
                return false;
        }
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[row][i] == 'Q')
                return false;
        }

        int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {
            if (arr[r][c] == 'Q')
                return false;

            r--;
            c--;
        }

        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < arr.length) {
            if (arr[r][c] == 'Q')
                return false;

            r--;
            c++;
        }

        return true;
    }

    public boolean dfs(char[][] arr, int row, List<List<String>> list) {
        int n = arr.length;
            if (row == n) {
                    List<String> list1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuffer str = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    str.append(arr[i][j]);

                }
                list1.add(str.toString());

            }
            list.add(list1);
            return true;
        }
       
            for (int j = 0; j < n; j++) {
             
                if (way(arr, row, j)) {
                   
                    arr[row][j]='Q';
                    dfs(arr,row+1,list);
                    arr[row][j]='.';
                    
                }
            

        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] arr = new char[n][n];
        for (char[] c : arr) {
            Arrays.fill(c, '.');
        }
        dfs(arr,0,list);
       return list;
    }
}