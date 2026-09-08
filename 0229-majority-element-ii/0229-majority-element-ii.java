class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) 
        {
            if (count1 == 0 && el2 != arr[i])
            {
                    count1=1;
                    el1 = arr[i];

            } 
            else if (count2 == 0 && el1 != arr[i]) 
            {
                count2=1;
                el2 = arr[i];
            } 
            else if (el1 == arr[i]) 
            {
                count1++;
            } 
            else if(el2 == arr[i]) 
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
       ArrayList<Integer> list =  new ArrayList<>();
       count1 = 0;
       count2 = 0;
       for(int i :arr){
        if(el1==i) count1++;
        if(el2==i) count2++;
       }
       int len = arr.length/3 + 1;
       if(count1>=len) list.add(el1); 
       if(count2>=len) list.add(el2); 
       Collections.sort(list);
        return list;
    }
}