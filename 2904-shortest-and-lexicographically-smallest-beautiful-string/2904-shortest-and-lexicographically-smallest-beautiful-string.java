class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuffer str = new StringBuffer();
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == '1') {
                    count++;
                }
                str.append(ch);
                if (count == k) {
                    list.add(str.toString());

                }
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