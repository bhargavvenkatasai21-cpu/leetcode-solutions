class Solution {
    // public static void main(String[]args){
    public boolean isPalindrome(int x) {
        int rev=x;
        int a=0;
        while(rev>0){
            int i=rev%10;
            rev=rev/10;
            a=a*10+i;
        }
        if(a==x){
            return true;
        }
        else {
            return false;
        }
    }
  }     
