class Solution {
    public String removeOuterParentheses(String s) {
        int left = 0, idx = 0;
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(s.charAt(i) == '('){
                if(left == 0)idx = i;
                left++;
            }
            else{
                if(left == 1){
                    arr[idx] = '\0';
                    arr[i] = '\0';
                }
                left--;
            }
        }
        return new String(arr).replace("\0","");
    }
}