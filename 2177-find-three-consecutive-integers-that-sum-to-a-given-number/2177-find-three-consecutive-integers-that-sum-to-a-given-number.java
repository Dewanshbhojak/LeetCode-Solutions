class Solution {
    public long[] sumOfThree(long num) {
        long val = num/3;
        if(val-1 + val + val+1 != num) return new long[0];
        return new long[]{val-1,val,val+1};
    }
}