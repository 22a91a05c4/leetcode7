class Solution {
    int sums(int n)
    {
        int s=0;
        int r;
        int ans=0;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        if(s<10)
        {
            ans=s;
        }
        else
        {
            ans=sums(s);
        }
        return ans;
    }
    public int addDigits(int num) {
        int val=sums(num);
        return val;
    }
}