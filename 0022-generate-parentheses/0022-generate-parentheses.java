class Solution {
    public static List<String> bracket(int open, int close,  ArrayList<String> list,String str,int n) {
    if(open == n && close == n && open ==  close){
         list.add(str);
         return list;
    }

    if(close < open) {
           String str1  = str + ")";
             bracket(open,close+1,list,str1,n);
    }  
    if(open+1 <=n) {
       
     String str2  = str + "(";
     bracket(open+1,close,list,str2,n);
    }
    
    
    return list;

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        if(n==1) {
            list.add("()");
            return list;
        }
        String str = new String();
        return bracket(0,0,list,str,n);
        
    }
}