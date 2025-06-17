class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int count = nums.length / 3;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() > count)res.add(entry.getKey());
        }
        return res;
    }
}