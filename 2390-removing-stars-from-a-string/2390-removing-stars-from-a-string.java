class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)!='*')sb.append(s.charAt(i));
            else{
                int j = i;
                while(j < s.length() && s.charAt(j) == '*')j++;
                sb.delete(sb.length() - j + i,sb.length());
                i = j-1;
            }
        }
        return new String(sb);
    }
}