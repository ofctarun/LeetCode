class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(sb);
                sb = new StringBuilder();
            }
            else if(ch == ')'){
                sb.reverse();
                sb = st.pop().append(sb);
            }
            else sb.append(ch);
        }
        return new String(sb);
    }
}