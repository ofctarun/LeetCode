class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int prev = skill[0]+skill[skill.length-1];
        long ans = skill[0]*skill[skill.length-1];
        for(int i=1;i<skill.length/2;i++){
            if(prev != skill[i]+skill[skill.length-i-1])return -1;
            ans += skill[i]*skill[skill.length-i-1];
        }
        return ans;
    }
}