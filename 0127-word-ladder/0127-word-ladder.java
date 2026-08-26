class Pair {
    String str;
    int level;

    Pair(String str, int level) {
        this.str = str;
        this.level = level;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(beginWord, 0));
        HashSet<String> list =new HashSet<>();
        for(String s : wordList) {
            list.add(s);
        }
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int level = p.level;
            StringBuffer s = new StringBuffer(p.str);
           
            if (s.toString().equals(endWord)) {
                return level + 1;
            }
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                for (char c = 'a'; c <= 'z'; c++) {
                    s.setCharAt(i, c);
                    if (list.contains(s.toString())) {
                         list.remove(s.toString());
                        queue.offer(new Pair(s.toString(), level + 1));
                    }
                }
                s.setCharAt(i, ch);
            }
        }
        return 0;
    }
}
