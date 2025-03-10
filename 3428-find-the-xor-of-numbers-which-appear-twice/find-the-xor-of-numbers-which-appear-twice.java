class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                xor=xor^nums[i];
            }
            else
            {
                hs.add(nums[i]);
            }
        }
        return xor;
    }
}