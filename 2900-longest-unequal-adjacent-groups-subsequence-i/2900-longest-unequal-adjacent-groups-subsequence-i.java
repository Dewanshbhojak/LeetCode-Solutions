class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        
        List<String> res = new ArrayList<>();

        int prev = -1;

        for (int i = 0; i < words.length; i++) {

            if (prev == -1 || groups[prev] != groups[i]) {
                res.add(words[i]);
                prev = i;
            }
        }

        return res;
    }
}