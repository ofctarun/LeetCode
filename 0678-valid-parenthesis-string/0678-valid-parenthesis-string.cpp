class Solution {
public:
    bool checkValidString(string s) {
        stack<int>open,star;
        int len = s.size();
        for(int i=0;i<len;i++){
            if(s[i] == '('){
                open.push(i);
            }
            if(s[i] == '*'){
                star.push(i);
            }
            if(s[i] == ')'){
                if(!open.empty()){
                    open.pop();
                }
                else if(!star.empty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!open.empty()){
            if(star.empty() || star.top()<open.top()){
                return false;
            }
            star.pop();
            open.pop();
        }
        return true;
    }
};