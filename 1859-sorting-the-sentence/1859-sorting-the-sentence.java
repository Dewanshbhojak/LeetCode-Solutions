class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        Arrays.sort(str,(a,b)->{
            int aval = a.charAt(a.length()-1) - '0';
            int bval = b.charAt(b.length()-1) - '0';
            return Integer.compare(aval,bval);
        });
        StringBuffer res = new StringBuffer();
        for(String s1 : str){
            res.append(s1);
            res.deleteCharAt(res.length()-1);
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}