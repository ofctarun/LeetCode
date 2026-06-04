class Solution {
    int waviness(int i){
        String str = Integer.toString(i);
        char arr[] = str.toCharArray();
        int c = 0;
        for(int j = 1; j < arr.length - 1; j++){
            if((Integer.valueOf(arr[j]) > Integer.valueOf(arr[j -1])) && (Integer.valueOf(arr[j]) > Integer.valueOf(arr[j + 1])))c++;
            if((Integer.valueOf(arr[j]) < Integer.valueOf(arr[j -1])) && (Integer.valueOf(arr[j]) < Integer.valueOf(arr[j + 1])))c++;
        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1 ; i <= num2 ; i++)if(i > 100)ans += waviness(i);
        return ans;
    }
}