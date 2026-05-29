class Solution {
    public void sortColors(int[] nums) {
        int cotzero=0;
        int cotone=0;
        int cottwo=0;
        for (int n:nums){
            if(n==0){
                cotzero++;
            }
            if(n==1){
                cotone++;
            }  
            if(n==2){
                cottwo++;
            }
        }
        int index=0;
        for(int i=0; i<cotzero; i++){
            nums[index]=0;
            index++;
        }
        for(int i=0; i<cotone; i++){
           nums[index]=1;
            index++; 
        }
        for(int i=0; i<cottwo; i++){
            nums[index]=2;
            index++;
        }
    }
}