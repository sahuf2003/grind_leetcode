class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing_no = -1;
        for(int i=0; i<nums.length;i++){
            if(i != nums[i]){
                missing_no = i;
                break;
            }
            missing_no = i+1;
        }
     return missing_no;
    }

}