class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            int m=nums[i];
            int l=(Integer.toString(nums[i])).length();
            if(l==1)
            {
                a+=m;
            }
            else
            {
                b+=m;
            }
        }
        if(a==b)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}