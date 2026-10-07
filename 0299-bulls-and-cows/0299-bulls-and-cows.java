class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        HashSet<Integer> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<secret.length();i++){
                if(secret.charAt(i)==guess.charAt(i)){
                    set.add(i);
                    bull++;
                }
                else{
                map.put(guess.charAt(i),map.getOrDefault(guess.charAt(i),0)+1);
                }
        }
        int cows = 0;
        for(int i = 0;i<secret.length();i++){
            char ch = secret.charAt(i);
            if(set.contains(i)) continue;
            if(map.containsKey(ch)){
                 cows++;
                 int val = map.get(ch);
                 if(val ==1){
                    map.remove(ch);
                 }else{
                    map.put(ch,val-1);
                 }
            }
        }
        StringBuffer res = new StringBuffer();
        res.append(bull);
        res.append('A');
        res.append(cows);
        res.append('B');
        return res.toString();
    }
}