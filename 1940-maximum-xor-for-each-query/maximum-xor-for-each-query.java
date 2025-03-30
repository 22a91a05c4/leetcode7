class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ans = new int[nums.length];
        //int maxval=Arrays.max(nums);
        int xores=(int)Math.pow(2,maximumBit)-1;
        int h=0;
        int totalXor = 0;
        for (int num : nums) {
            totalXor ^= num;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[h++] = totalXor ^ xores;
            totalXor ^= nums[i];
        }
        return ans;
    }
}