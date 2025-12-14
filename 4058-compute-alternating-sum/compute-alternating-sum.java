class Solution {
    public int alternatingSum(int[] nums) {
        int ans=0;
        /*for(int i=0;i<nums.length;i++)
        {
            if(i==0 || i%2==0)
            {
                ans=ans+nums[i];
            }
            else
            {
                ans=ans-nums[i];
            }
        }*/
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum1=sum1+nums[i];
        }
        for(int i=1;i<nums.length;i+=2)
        {
            sum2=sum2+nums[i];
        }
        ans=sum1-sum2;
        return ans;
    }
}