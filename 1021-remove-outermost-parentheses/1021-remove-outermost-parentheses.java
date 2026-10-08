class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                if(left > 0)sb.append(c);
                left++;
            } else {
                left--;
                if(left > 0)sb.append(c);
            }
        }
        return sb.toString();
    }
}