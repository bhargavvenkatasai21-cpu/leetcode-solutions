class Solution {
    public int reverse(int x) {
        int n =x;
        int r=0;
        while(n!=0){
            // int div =n/10;
            int dig=n%10;
            // n=div;
            n=n/10;
            if(r>Integer.MAX_VALUE/10||r<Integer.MIN_VALUE/10){
                return 0;
            }
            r=r*10+dig;
                
        }
        return r;
 
    }
}