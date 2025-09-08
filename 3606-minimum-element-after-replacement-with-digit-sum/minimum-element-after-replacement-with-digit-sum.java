class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int g=returning(nums[i]);
            min = Math.min(min,g);
        }
        return min;
    }
    int returning(int b)
    {
        int s=0;
        int q;
        while(b!=0)
        {
            q=b%10;
            s=s+q;
            b=b/10;
        }
        if(s>=10)
        {
            returning(s);
        }
        return s;
    }
}