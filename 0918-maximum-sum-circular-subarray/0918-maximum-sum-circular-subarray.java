class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        // int sum=0;
        int total=0;
        int maxsum=Integer.MIN_VALUE;
        int curmax=0;
        int curmin=0;
        int minsum =Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            total+=nums[i];
            curmax+=nums[i];
            maxsum=Math.max(maxsum,curmax);
            if(curmax<0){
                curmax=0;
            }
            curmin+=nums[i];
            minsum=Math.min(minsum,curmin);
            if(curmin>0){
                curmin=0;
            }
            
        }
        if(maxsum<0) {
            return maxsum;
        }
         return Math.max(maxsum, total-minsum);

    }
}