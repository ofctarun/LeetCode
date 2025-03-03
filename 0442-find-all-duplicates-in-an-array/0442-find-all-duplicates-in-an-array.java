class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            freq[nums[i]-1]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                list.add(i+1);
            }
        }
        return list; 
    }
}