class Solution {
public:

    bool rev(int i, vector<char>&str){
        if(i>=str.size()/2) return true;
        if (str[i] == str[str.size() - i -1]) {
            return rev(i+1,str);
        }else{
            return false;
        }
    }
    bool isPalindrome(string s){
        vector<char>str;
        
        for(auto &i :s){
            i = tolower(i);
            if(ispunct(i) or i==' '){
                continue;
            }
            str.push_back(i);
        }
        return rev(0,str);
}
};