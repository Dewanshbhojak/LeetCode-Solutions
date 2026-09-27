class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == ')'){
                StringBuffer str  = new StringBuffer();
                while(true){
                    char c = stack.pop();
                    if(c=='(') break;
                    str.append(c);
                }
                for(int j =0;j<str.length();j++){
                    stack.push(str.charAt(j));
                }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuffer str = new StringBuffer();
        for(char ch : stack) {
            str.append(ch);
        }
        StringBuffer res = new StringBuffer();
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            res.append(ch);
        }
        return res.toString();
    }
}