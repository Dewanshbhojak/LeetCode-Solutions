class Solution {
    public int countCommas(int n) {
        int count = 0;
        for(int i = 1000;i<=n;i++){
            if(i<=99999) {
                count++;
            }
            else if(i<=999999){
                count++;
              
            }
        }
        return count;
    }
}