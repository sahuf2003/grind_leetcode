class Solution {
public:
    string reversePrefix(string word, char ch) {
        int c;
        for(int i=0;i<=word.length()-1;i++){
            if (word[i] == ch){
                c = i;
                break;
            }
            int last = word.length()-1;
            if (i == last) return word;
        }
        char b;
        for(int j=0; j<=c/2;j++){
            b = word[j];
            word[j] = word[c-j];
            word[c-j] = b;
        }
        return word;
    }
};