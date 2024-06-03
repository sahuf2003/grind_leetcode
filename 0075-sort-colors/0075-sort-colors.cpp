class Solution {
public:
    void sortColors(vector<int>& nums) {
        for (int i = 0; i < nums.size(); i++){
            if(nums[i] == 2){
                for(int j=nums.size() - 1; j > i;j--) {
                    if (nums[j] != 2){
                        swap(nums[i], nums[j]);
                        break;
                    }
                }
            }
            if(nums[i] == 0){
                for(int j = 0;j < i;j++){
                    if(nums[j] != 0){
                        swap(nums[i], nums[j]);
                        break;
                    }
                }
            }
        }
    }
};