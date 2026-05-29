class Solution {
    public int search(int[] nums, int target) {
        int stat=0;
        int end=nums.length-1;
        while(stat<=end){
            int mid =(stat+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                stat=mid+1; 
                // return stat;

            }
            else{
                end=mid-1;
                // return end;
               
            }
        }
        return -1;
    }
}