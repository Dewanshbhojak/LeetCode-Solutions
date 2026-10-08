class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer str = new StringBuffer();
        int index = 0;
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            str.append(ch);
            if(ch=='(') {
                stack.push(ch);
             
            }
            else{
                
                stack.pop();
            }
            if(stack.isEmpty()){
                str.deleteCharAt(index);
                str.deleteCharAt(str.length()-1);
                index = str.length();

            }
        }
        return str.toString();
    }
}