class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
        int ln=nums.length;
        for (int i=0; i<ln; i++){
            if(nums[i]!=1){ 
                count=0; 
            }
            else{
                count++;
                 max=Math.max(max,count);
             }           
        }
        return max;
    }
}