class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i)!='*')sb.append(s.charAt(i));
            else{
                int j = i;
                while(j < n && s.charAt(j) == '*')j++;
                sb.delete(sb.length() - j + i,sb.length());
                i = j-1;
            }
        }
        return new String(sb);
    }
}