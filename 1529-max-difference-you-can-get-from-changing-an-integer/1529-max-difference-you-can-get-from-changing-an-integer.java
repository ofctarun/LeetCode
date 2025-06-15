class Solution {
    public int maxDiff(int num) {
        String max = Integer.toString(num);
        String min = Integer.toString(num);
        for(char ch : max.toCharArray()){
            if(ch != '9'){
                max = max.replace(ch,'9');
                break;
            }
        }
        if(min.charAt(0) != '1'){
            min = min.replace(min.charAt(0),'1');
            return Integer.parseInt(max) - Integer.parseInt(min);
        }
        for(int i=1;i<min.length();i++){
            if(min.charAt(i) != '0' && min.charAt(i) != min.charAt(0)){
                min = min.replace(min.charAt(i),'0');
                break;
            }
        }
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}