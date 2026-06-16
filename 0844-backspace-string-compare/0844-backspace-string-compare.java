class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while(i >= 0 || j >= 0){
            i = getIndex(s,i);
            j = getIndex(t,j);
            char S = (i >= 0) ? s.charAt(i) : '#';
            char T = (j >= 0) ? t.charAt(j) : '#';
            if(S != T)return false;
            i--;
            j--;
        }
        return true;
    }
    int getIndex(String str, int index) {
        int skip = 0;
        while(index >= 0){
            if(str.charAt(index) == '#'){
                skip++;
                index--;
            }else if(skip > 0){
                skip--;
                index--;
            }else{
                break;
            }
        }
        return index;
    }
}
