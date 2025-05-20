class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        //Difference array technique
        int diffArray[] = new int[nums.length];
        for(int i=0;i<queries.length;i++){
            diffArray[queries[i][0]] += 1;
            if(queries[i][1]+1<diffArray.length) diffArray[queries[i][1]] -= 1;
        }
        if(diffArray[0] < nums[0]) return false;
        for(int i=1;i<nums.length;i++){
            diffArray[i] += diffArray[i-1];
            if(diffArray[i] < nums[i]) return false;
        }
        return true;
    }
}