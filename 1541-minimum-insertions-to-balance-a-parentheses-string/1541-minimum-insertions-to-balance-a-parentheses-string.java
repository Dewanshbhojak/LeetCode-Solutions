class Solution {
    public int minInsertions(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        count++;
                    }
                    i++;
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
            i++;
        }

        count += stack.size() * 2;

        return count;
    }
}
