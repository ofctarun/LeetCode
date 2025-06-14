class Solution {
    public int minMaxDifference(int num) {
        String max = Integer.toString(num);
        String min = Integer.toString(num);
        for(char ch : max.toCharArray()){
            if(ch != '9'){
                max = max.replace(ch,'9');
                break;
            }
        }
        min = min.replace(min.charAt(0),'0');
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}