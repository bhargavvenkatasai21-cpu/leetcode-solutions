class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f=0;
        int l=numbers.length-1; 
        int rel[]=new int [2];
        rel[0]=-1;
        rel[1]=-1;
        while(f<l){
           int sum=numbers[f]+numbers[l];
             if(sum==target){
                rel[0]=f+1;
                rel[1]=l+1;
             return rel;
             }
                else if(sum<target){
                f++;
             }
             else{
                
            l--;
             }
          
        }return rel;
    }
}