class Solution {
    public int[] searchRange(int[] nums, int target) {
        int out[]= new int [2];

        int first=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                first=i;
                break;
            } 
        }
        int second=-1;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==target){
                second=i;
                break;
            } 
        }
        out[0]=first;
        out[1]=second;
        return out;
    }
}