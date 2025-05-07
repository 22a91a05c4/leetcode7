class Solution {
    public int hammingWeight(int n) {
        int tot=0;
        while(n!=0)
        {
            n=n&(n-1);
            tot++;
        }
        return tot;
    }
}