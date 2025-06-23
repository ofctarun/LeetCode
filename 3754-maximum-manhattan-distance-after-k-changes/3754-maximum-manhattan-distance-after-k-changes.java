class Solution {  
    public int maxDistance(String s, int k) {  
        int up = 0, down = 0, left = 0, right = 0;  
        int maxDistance = 0;  

        for (int index = 0; index < s.length(); index++) {  
            char direction = s.charAt(index);  
            
            switch (direction) {  
                case 'N':  
                    up++;  
                    break;  
                case 'S':  
                    down++;  
                    break;  
                case 'E':  
                    right++;  
                    break;  
                case 'W':  
                    left++;  
                    break;  
            }  
            int verticalShift = Math.abs(up - down);  
            int horizontalShift = Math.abs(right - left);  
            int baseDistance = verticalShift + horizontalShift;  
            int interferingMoves = Math.min(up, down) + Math.min(right, left);  
            int maxPossibleDistance = baseDistance + Math.min(k, interferingMoves) * 2;
            maxDistance = Math.max(maxDistance, maxPossibleDistance);  
        }  

        return maxDistance;  
    }  
}