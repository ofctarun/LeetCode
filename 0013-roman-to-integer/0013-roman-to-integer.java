class Solution {
    public int romanToInt(String s) {
        int ans = 0,idx=0;
        while(idx<s.length()){
            if(s.charAt(idx)=='I'){
                if((idx+1)<s.length() && s.charAt(idx+1)=='V'){
                    ans+=4;
                    idx++;
                }
                else if((idx+1)<s.length() && s.charAt(idx+1)=='X'){
                    ans+=9;
                    idx++;
                }
                else ans+=1;
            }
            else if(s.charAt(idx)=='V')ans+=5;
            else if(s.charAt(idx)=='X'){
                if((idx+1)<s.length() && s.charAt(idx+1)=='L'){
                    ans+=40;
                    idx++;
                }
                else if((idx+1)<s.length() && s.charAt(idx+1)=='C'){
                    ans+=90;
                    idx++;
                }
                else ans+=10;
            }
            else if(s.charAt(idx)=='L')ans+=50;
            else if(s.charAt(idx)=='C'){
                if((idx+1)<s.length() && s.charAt(idx+1)=='D'){
                    idx++;
                    ans+=400;
                }
                else if((idx+1)<s.length() && s.charAt(idx+1)=='M'){
                    ans+=900;
                    idx++;
                }
                else ans+=100;
            }
            else if(s.charAt(idx)=='D')ans+=500;
            else ans+=1000;
            idx++;
        }
        return ans;
    }
}