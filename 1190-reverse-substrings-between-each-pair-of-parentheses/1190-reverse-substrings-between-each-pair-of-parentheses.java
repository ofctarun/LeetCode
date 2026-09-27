class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> open = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') open.add(sb.length());
            else if(s.charAt(i) == ')'){
                int start = open.remove(open.size()-1);
                String rev = new StringBuilder(sb.substring(start)).reverse().toString();
                sb.replace(start,sb.length(),rev);
            }
            else sb.append(s.charAt(i));
        }
        return new String(sb);
    }
}