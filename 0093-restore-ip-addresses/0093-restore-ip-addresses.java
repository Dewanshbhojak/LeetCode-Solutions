class Solution {
    public void dfs(String s, int n, StringBuffer str, List<String> list, int count ) {
       if(count == 0) {
    if(n == s.length()) {
        list.add(str.substring(0, str.length() - 1));
    }
    return;
}
if(n>=s.length()) return;
        if (s.charAt(n) == '0') {
            str.append("0.");
            dfs(s, n + 1, str, list,count-1);
            str.deleteCharAt(str.length() - 1);
            str.deleteCharAt(str.length() - 1);
        } else {
            for (int i = 1; i <= 3 && n + i <= s.length(); i++) {
                String part = s.substring(n, n + i);

                if (Integer.parseInt(part) <= 255) {
                    str.append(part).append('.');
                    dfs(s, n + i, str, list,count-1);
                    str.delete(str.length() - part.length() - 1, str.length());
                }
            }
        }

    }

    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() <= 3 || s.length() > 12)
            return list;
            StringBuffer str = new StringBuffer();
            dfs(s,0,str,list,4);
            return list;
    }
}