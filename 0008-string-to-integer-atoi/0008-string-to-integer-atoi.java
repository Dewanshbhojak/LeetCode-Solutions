class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty())return 0;
        String str  = s.trim();
          if(str.isEmpty())return 0;
        StringBuffer res = new StringBuffer();
        char status = (str.charAt(0)=='-')?'n':'p';
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch=='0' && res.length()==0) {
                continue;
            }
            if(ch=='-'&& i==0) continue;
             if(ch=='+'&& i==0) continue;
            if(ch<'0'||ch>'9'){
                break;
            }
                res.append(ch);
        }
        if(res.length()==0) return 0;
        long val = 0;
        for(int i = 0;i< res.length();i++) {
            char c= res.charAt(i);
            val = val*10+(c-'0');
            if(status =='n' && -val < Integer.MIN_VALUE ) return Integer.MIN_VALUE;
            if(val > Integer.MAX_VALUE && status !='n') return  Integer.MAX_VALUE;
                    }
        val = (status=='n')?-Math.abs(val):val;
        if(val < Integer.MIN_VALUE && status =='n') val = Integer.MIN_VALUE;
         if(val > Integer.MAX_VALUE) val = Integer.MAX_VALUE;
        return (int)val;
    }
}