class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for(char c : s.toCharArray()){
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