class Solution {
    public int smallestNumber(int n) {
        int ans=0;
        for(int i=n;i<=Integer.MAX_VALUE;i++)
        {
            String s1 = Integer.toBinaryString(i);
            if(!s1.contains("0"))
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}