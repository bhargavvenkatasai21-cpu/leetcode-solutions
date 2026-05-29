class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ev=0;
        int od=1;
        int ln=nums.length;
        int []ar=new int[ln];
        for(int i=0; i<ln; i++){
            if(nums[i]>0){
                ar[ev]=nums[i];
                ev+=2;
            }else{
                ar[od]=nums[i];
                od+=2;
            }
            
        }
         
        return ar;
    }
}