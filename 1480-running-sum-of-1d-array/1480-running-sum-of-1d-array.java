class Solution {
    public int[] runningSum(int[] nums) {
        int a=0;
        int b=1;
        for(int i=1; i<nums.length; i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}