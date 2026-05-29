class Solution {
    public int findNumbers(int[] nums) {
        int cont=0;
        for(int i=0; i<nums.length; i++){
            int dig=0;
            int num=nums[i]; 
            while(num>0){
                num=num/10;
                dig++;
            }
            if(dig % 2 == 0){
                cont++;
            }
            
        }
        return cont;
    }
}