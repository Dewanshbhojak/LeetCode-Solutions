class Solution {
    public String[] findWords(String[] words) {
        int[] row = new int[26];

        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for (char c : r1.toCharArray()) {
            row[c - 'a'] = 1;
        }

        for (char c : r2.toCharArray()) {
            row[c - 'a'] = 2;
        }

        for (char c : r3.toCharArray()) {
            row[c - 'a'] = 3;
        }

        List<String> list = new ArrayList<>();

        for (String word : words) {
            String str = word.toLowerCase();

            int targetRow = row[str.charAt(0) - 'a'];
            boolean valid = true;

            for (int i = 1; i < str.length(); i++) {
                if (row[str.charAt(i) - 'a'] != targetRow) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}