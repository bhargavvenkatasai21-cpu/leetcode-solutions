class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int max=nums[0];
        int ln=nums.length;
        for(int i=0; i<ln; i++)  {
            if(count==0){
                max=nums[i];
            }
              if(nums[i]==max){
                count++;
            }
            else{
                count--;
            } 
         }
        return max;
    }
}