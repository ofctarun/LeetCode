class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0, j = numbers.length - 1; i < j;){
            int sum = numbers[i] + numbers[j];
            if(sum == target)return new int[]{++i, ++j};
            if(sum > target)j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}