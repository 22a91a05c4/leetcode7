class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=0;
        for(int i : nums)
        {
            ans=ans|i;
        }
        return ans*(1<<(nums.length-1));
    }
}