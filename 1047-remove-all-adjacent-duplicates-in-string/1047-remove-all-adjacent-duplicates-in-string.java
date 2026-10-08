class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int n = sb.length() - 1;
            if(!sb.isEmpty() && sb.charAt(n) == ch)sb.deleteCharAt(n);
            else sb.append(ch);
        }
        return new String(sb);
    }
}