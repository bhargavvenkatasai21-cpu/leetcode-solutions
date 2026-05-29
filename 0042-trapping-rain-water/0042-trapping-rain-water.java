class Solution {
    public int trap(int[] height) {
       int ln=height.length;
       int leftmax[]=new int [ln];
       int rightmax[]=new int [ln];
       leftmax[0]=height[0];
       rightmax[ln-1]= height[ln-1];
       for(int i=1; i<ln; i++){
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
       }
       for(int j=ln-2; j>=0; j--){
        rightmax[j]=Math.max(rightmax[j+1],height[j]);
       }
       int total=0;
       for(int k=0; k<ln; k++){
        total=total+Math.min(leftmax[k],rightmax[k])-height[k];
      
       }
        return total;
    }
}