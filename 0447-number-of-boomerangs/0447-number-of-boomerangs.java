class Solution {
    public int numberOfBoomerangs(int[][] arr) {
        int count = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                for(int k = 0;k<arr.length;k++)
                {
                        if(k!=j&&k!=i&& i!=j) {
                           int dist1 =
    (arr[k][0] - arr[j][0]) * (arr[k][0] - arr[j][0]) +
    (arr[k][1] - arr[j][1]) * (arr[k][1] - arr[j][1]);

int dist2 =
    (arr[k][0] - arr[i][0]) * (arr[k][0] - arr[i][0]) +
    (arr[k][1] - arr[i][1]) * (arr[k][1] - arr[i][1]);
                            if(dist1==dist2){
                                count++;
                            }
                        }
                }
            }
        }
        return count;
    }
}