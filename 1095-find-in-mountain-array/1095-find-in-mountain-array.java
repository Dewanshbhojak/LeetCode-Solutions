/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public static int leftbinary(int target, MountainArray list , int i ,int j) {
        int res = -1;
       
        while(i<=j){
             int mid = i+(j-i)/2;
            if(list.get(mid) == target){
                    return mid;
            }
            if(list.get(mid)<target) {
                i=mid+1;
            }else{
                j=mid-1;
            }

        }
        return res;
    }
     public static int rightbinary(int target, MountainArray list , int i ,int j) {
        int res = -1;
       
        while(i<=j){
             int mid = i+(j-i)/2;
            if(list.get(mid) == target){
                    return mid;
            }
            if(list.get(mid)>target) {
                i=mid+1;
            }else{
                j=mid-1;
            }

        }
        return res;
    }
    public int findInMountainArray(int target, MountainArray list) {
        int length = list.length();
        int i = 1;
        int j = length-1;
        int c = -1;
        while(i<=j) {
            int mid = i+(j-i)/2;
            if(list.get(mid) > list.get(mid-1) && list.get(mid) > list.get(mid+1)){
                    c=mid;
                    break;
            }
            if(list.get(mid) > list.get(mid-1) && list.get(mid) < list.get(mid+1)){
                i =mid+1;
            }
            else {
                j=mid-1;
            }

        }
        if(c ==-1) return -1;
        int left = leftbinary(target,list,0,c);
        int right = rightbinary(target,list,c,length-1);
        if(left ==-1) {
            return right;
        }
        if(right == -1){
            return left;
        }
        return Math.min(left,right);
    }
}