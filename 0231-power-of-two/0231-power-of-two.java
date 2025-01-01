class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<0){
            return false;
        }
        String x = Integer.toBinaryString(n);
        
        int y = x.lastIndexOf("1");
        if(y==0){
            return true;
        }


        return false;
    }
}