class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> array = new HashMap<>();
        for(int i:nums){
            array.put(i,array.getOrDefault(i,0)+1);
        }
        for(int i:array.keySet()){
            if(array.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}