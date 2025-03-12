class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left=0,right=n;
        while(left<right){  
            int mid = (right+left)/2;  
            if(nums[mid]>=0){
                right=mid;  
            }else{  
                left=mid+1;  
            }  
        }  
        int negCount=left;
        left=0;
        right=n;
        while(left<right){  
            int mid=(right+left)/2;  
            if(nums[mid]>0){
                right=mid;  
            }else{  
                left=mid+1;  
            }  
        }  
        int posCount=n-left;
        return Math.max(negCount,posCount);  
    }
}