class Solution {
    public String makeFancyString(String s) {
        char[] result = new char[s.length()];
        int write = 0;
        for (int read = 0; read < s.length(); read++) {
            if(write<2||!(s.charAt(read)==result[write-1]&&s.charAt(read)==result[write-2])){
                result[write++] = s.charAt(read);
            }
        }
        return new String(result, 0, write);
    }
}