class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<char> chars;
        if(s == ""){
            return 0;
        }
        else{
            chars.push_back(s[0]);
        }
        int max = -1,count = 0 ;
        for(int i = 1 ;i< s.length() ; i++){
            count = chars.size();
            if(count>max){
                max = count;
            }
            for(int j = 0 ; j<chars.size(); j++){
                if(s[i] == chars[j]){ 
                    int k = j;
                    chars.erase(chars.begin(),chars.begin()+(k+1));
                        
                
                    count = chars.size();
                    if(count>max){
                        max = count;
                    }
                    break;
                }
            }
            chars.push_back(s[i]);
            
        }
        count = chars.size();
            if(count>max){
                max = count;
            }
        return max;
    }
};