class Solution {  
    public int maxDifference(String s) {  
        HashMap<Character,Integer> hm  = new HashMap<>();  
        for(char ch : s.toCharArray()){  
            hm.put(ch,hm.getOrDefault(ch,0)+1);  
        }  
        int oddMin = Integer.MAX_VALUE, oddMax = Integer.MIN_VALUE;  
        int evenMin = Integer.MAX_VALUE, evenMax = Integer.MIN_VALUE;  
        for(int val : hm.values()){  
            if(val%2==0){  
                if(val<evenMin) evenMin=val;  
                if(val>evenMax) evenMax=val;  
            } else {  
                if(val<oddMin) oddMin=val;  
                if(val>oddMax) oddMax=val;  
            }  
        }  
        int maxDiff1 = oddMax - evenMin;  
        int maxDiff2 = oddMax - evenMin;  
        return Math.max(maxDiff1, maxDiff2);  
    }  
}