class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] present = new boolean[101];
        int low = 101, high = 0;
        for(int x : nums){
            present[x] = true;
            if(x < low)low = x;
            if(x > high)high = x;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = low;i <= high;i++){
            if(!present[i])ans.add(i);
        }
        return ans;
    }
}