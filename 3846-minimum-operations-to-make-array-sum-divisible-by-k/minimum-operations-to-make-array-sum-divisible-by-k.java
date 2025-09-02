class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int c=0;
        for(int i:nums)
        {
            sum=sum+i;
        }
        while((sum%k)!=0)
        {
            sum=sum-1;
            c++;
        }
        return c;
    }
}