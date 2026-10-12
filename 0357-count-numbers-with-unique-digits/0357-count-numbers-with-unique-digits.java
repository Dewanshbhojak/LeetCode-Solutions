class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int count = 0;
        for(int i = 0;i<=n;i++){
            if(i==0) {
                count+=1;
                continue;
            }
            if(i==1) {
                count+=9;
                continue;
            }
            if(i==2){
                count+=(9*9);
                continue;
            }
            if(i==3){
                count+=(9*9*8);
                continue;
            }
            if(i==4){
                count+=(9*9*8*7);
                continue;
            }if(i==5){
                count+=(9*9*8*7*6);
                continue;
            }
            if(i==6){
                count+=(9*9*8*7*6*5);
                continue;
            }
            if(i==7){
                count+=(9*9*8*7*6*5*4);
                continue;
            }
            if(i==8){
                count+=(9*9*8*7*6*5*4*3);
                continue;
            }
        }
        return count;
    }
}