class Solution {
    public long coloredCells(int n) {
        long ans=1;
        if(n==1)
        {
            ans=1;
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                ans=ans+(i-1)*4;
            }
        }
        return ans;
    }
}