class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==(i+1))
            {
                c++;
            }
        }
        if(nums[n-1]==n-1)
        {
            c+=1;
        }
        return c==n;
    }
}