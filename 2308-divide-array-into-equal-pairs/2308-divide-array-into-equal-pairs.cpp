class Solution {
public:
    bool divideArray(vector<int>& nums) {
        if(nums.size() & 1)return false;
        int freq[501];
        for(int num : nums)freq[num]++;
        for(int num : freq){
            if(num & 1)return false;
        }
        return true;
    }
};