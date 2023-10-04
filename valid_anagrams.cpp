class Solution {
public:
    bool isAnagram(string s, string t) {
        int freq[256]={0};
        for(int i=0;i<s.size();i++){
            freq[s[i]]++;
        }
        for(int i=0;i<t.size();i++){
            freq[t[i]]--;
        }

        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
};
