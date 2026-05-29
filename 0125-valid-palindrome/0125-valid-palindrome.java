class Solution {
    public static boolean valid(char s) {
        if (s >= 'a' && s <= 'z' || s >= '0' && s <= '9') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
        int st = 0, end = s.length() - 1;
        while (st < end) {
            while (st < end && !valid(s.charAt(st))) {
                st++;
            }
            while (st < end && !valid(s.charAt(end))) {
                end--;
            }
            if (s.charAt(st) != s.charAt(end))
                return false;

            st++;
            end--;
        }
        return true;

    }
}