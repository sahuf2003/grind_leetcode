class Solution {
    public int maxScore(String s) {
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String left = s.substring(0, i + 1); 
            String right = s.substring(i + 1);   
            int leftZero = 0;
            int rightOne = 0;

            for (char c : left.toCharArray()) {
                if (c == '0') {                
                    leftZero++;
                }
            }
            for (char c : right.toCharArray()) { 
                if (c == '1') {                
                    rightOne++;
                }
            }
            int count = leftZero + rightOne;   

            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}