class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = -1001, max2 = -1001, max3 = -1001, min1 = 1001, min2 = 1001;
        for(int el : nums){
            if(el >= max1){
                max3 = max2;
                max2 = max1;
                max1 = el;
            }
            else if(el >= max2){
                max3 = max2;
                max2 = el;
            }
            else if(el > max3){
                max3 = el;
            }
            if(el <= min1){
                min2 = min1;
                min1 = el;
            }
            else if(el < min2){
                min2 = el;
            }
        }
        return Math.max(max1*max2*max3, min1*min2*max1);
    }
}