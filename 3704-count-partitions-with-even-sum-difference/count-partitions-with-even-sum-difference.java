class Solution {
    public int countPartitions(int[] nums) {
        int s=0;
        for(int i=1;i<nums.length;i++)
        {
            int a=0,b=0;
            for(int j=0;j<i;j++)
            {
                a+=nums[j];
            }
            for(int j=i;j<nums.length;j++)
            {
                b+=nums[j];
            }
            if(Math.abs(a-b)%2==0)    s++;
        }
        return s;
    }
}