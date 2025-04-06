class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int c=0;
        int n=nums.length;
        int pows=1<<n;
        int samp=0;
        for(int i:nums)
        {
            samp|=i;
        }
        for(int i=0;i<pows;i++)
        {
            int or=0;
            for(int j=0;j<n;j++)
            {
                if((i & (1<<j))!=0)
                {
                    or=or|nums[j];
                }
            }
            if(or==samp)
            {
                c++;
            }
        }
        return c;
    }
}