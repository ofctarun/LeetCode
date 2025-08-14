class Solution {
    public String largestGoodInteger(String num) {
        for(int i=9;i>=0;i--){
            String curr = (Integer.toString(i)).repeat(3);
            if(num.contains(curr))return curr;
        }
        return "";
    }
}