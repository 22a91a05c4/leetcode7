class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int m1=nums[nums.length-1];
        int m2=nums[nums.length-2];
        int ans = (m1-1)*(m2-1);
        return ans;
    }
}