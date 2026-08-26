class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list = new ArrayList<>();
        StringBuffer str = new StringBuffer();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                count++;
            }
            str.append(ch);
            while (count >= k) {
                char c = str.charAt(0);
                if (count == k) {
                    list.add(str.toString());
                }
                if (c == '1') {
                    count--;
                }

                str.deleteCharAt(0);
            }
        }
        Collections.sort(list, (a, b) -> {

            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });
        if (list.size() == 0)
            return "";
        return list.get(0);
    }
}