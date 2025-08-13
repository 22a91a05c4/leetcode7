class Solution {
    public boolean isPowerOfThree(int n) {
        double f=n;
        if(n==1) return true;
        if(n==2) return false;
        if(n<=0) return false;
        while(f>=1.1)
        {
            f=f/3.0;
        }
        if(f==1.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}