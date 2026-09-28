class Solution {
    public int maxDepth(String s) {
        int c=0,e=0;
        for(char i : s.toCharArray()){
            if(i=='('){
                c++;
                e=Math.max(e,c);
            }
            else if(i==')'){
                c--;
            }
        }
         return e;
    }
}