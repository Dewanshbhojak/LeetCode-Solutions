class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        StringBuffer res = new StringBuffer();
        for(List<String> l : knowledge){
            map.put(l.get(0),l.get(1));
        }
        char status = 'c';
        StringBuffer str = new StringBuffer();
        for(int i = 0;i<s.length();i++) {
            if(status == 'c') {
                if(s.charAt(i)=='(') {
                    status='o';
                }
                else
                res.append(s.charAt(i));
            }else{
            if(s.charAt(i)==')'){
                status='c';
                res.append(map.getOrDefault(str.toString(),"?"));
                str= new StringBuffer();
            }else{
                str.append(s.charAt(i));
            }
            }
        }
        return res.toString();
    }
}