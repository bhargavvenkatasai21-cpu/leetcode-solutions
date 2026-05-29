class Solution {
    public void nextPermutation(int[] nums) {
        int ln=nums.length;
        int inx=-1;
        for(int i=ln-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                inx=i;
                break;
            }
        }
        if(inx==-1){
            rev(nums,0);
            return;
        }
        else{
        for(int i=ln-1; i>inx; i--){
            if(nums[i]>nums[inx]){
                swap(nums,i,inx);
                break;
            }

        }
        rev(nums,inx+1);
        }
    }
        public static void swap(int []nums,int i,int j){
                    int temp =nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
public static void rev(int nums[], int i){
    int st=i;
    int last=nums.length-1;
    while(st<last){
        swap(nums,st,last);
        st++;
        last--;
    }
}

}
 
