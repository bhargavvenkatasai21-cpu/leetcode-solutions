class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int check=0, max=0;
        for(int adder=0; adder<s.length(); adder++){
            while(set.contains(s.charAt(adder))){
                set.remove(s.charAt(check));
                check++;
            }
            set.add(s.charAt(adder));
            max=Math.max(max,(adder-check+1));
        }
        return max;
    }
}