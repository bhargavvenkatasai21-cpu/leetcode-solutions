class Solution {
    public boolean isAnagram(String s, String t) {
        int i =0, fln=s.length()-1;
       int sln=t.length()-1;
       if(fln!=sln)return false;
        int freq[]=new int[26];
        for(  i=0; i<=fln; i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int cout : freq){
            if(cout!=0){
                return false;
            }
        } 
    return true;  
    }
}