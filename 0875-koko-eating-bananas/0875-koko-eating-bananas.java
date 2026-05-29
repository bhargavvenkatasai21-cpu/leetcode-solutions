class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            max=Math.max(piles[i],max);
        }
        int start=1;
        int end=max;
       
        while(start<=end){
            int mid=(start+end)/2;

              long total=0;
           
            for(int j : piles) {
            total+=(j+mid-1)/mid;
            }
            if(total<=h){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}