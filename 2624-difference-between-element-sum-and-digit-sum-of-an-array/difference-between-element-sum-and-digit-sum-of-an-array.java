class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        for(int i=0;i<nums.length;i++)
        {
            if((Math.log10(nums[i])+1)==1)
            {
                es+=nums[i];
                ds+=nums[i];
            }
            else
            {
                es+=nums[i];
                while(nums[i]!=0)
                {
                    int r=nums[i]%10;
                    ds+=r;
                    nums[i]=nums[i]/10;
                }
            }
        }
        return Math.abs(es-ds);
    }
}