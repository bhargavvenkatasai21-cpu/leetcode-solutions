class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ln = nums.length;
        int result[] = new int[ln];
        int odd = 0, even = 1;
        for (int i = 0; i < ln; i++) {
            if (nums[i] % 2 == 0) {
                result[odd] = nums[i];
                odd += 2;
            } else {
                result[even] = nums[i];
                even += 2;
            }
        }
        return result;
    }
}