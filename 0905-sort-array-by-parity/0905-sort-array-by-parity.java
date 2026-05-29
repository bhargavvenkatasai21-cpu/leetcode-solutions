class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ln=nums.length,index=0;
        int result[]= new int [ln];
        for(int i=0; i<ln; i++){
            if(nums[i]%2==0){
                result[index]=nums[i];
                index++;
            }
        }
        for(int i=0; i<ln; i++){
             if(nums[i]%2!=0){
                result[index]=nums[i];
                index++;
             }
        }
        return result;
    }
}