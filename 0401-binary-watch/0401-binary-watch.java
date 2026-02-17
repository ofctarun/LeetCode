class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                if((Integer.bitCount(i) + Integer.bitCount(j)) == turnedOn){
                    String time = i + ":";
                    time += j < 10 ? "0" + j : j;
                    ans.add(time);
                };
            }
        }

        return ans;
    }
}