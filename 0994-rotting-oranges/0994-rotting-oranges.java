class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int orangesRotting(int[][] arr) {
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 2) {
                    queue.add(new Pair(i, j));
                }
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();
                int row = p.row;
                int col = p.col;
               
                if (row + 1 <= arr.length - 1 && arr[row + 1][col] == 1) {
                     arr[row+1][col] = 2;
                    queue.add(new Pair(row + 1, col));
                }
                if (row - 1 >= 0 && arr[row - 1][col] == 1) {
                     arr[row-1][col] = 2;
                    queue.add(new Pair(row - 1, col));
                }
                if (col + 1 <= arr[0].length - 1 && arr[row][col + 1] == 1) {
                     arr[row][col+1] = 2;
                    queue.add(new Pair(row, col + 1));
                }
                if (col - 1 >= 0 && arr[row][col - 1] == 1) {
                     arr[row][col-1] = 2;
                    queue.add(new Pair(row, col - 1));
                }
            }
            count++;
        }
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    return -1;
                }
            }
        }
        if(count==0) return 0;
        return count-1;
    }
}