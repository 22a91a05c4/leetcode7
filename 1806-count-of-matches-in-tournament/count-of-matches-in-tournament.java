class Solution {
    public int numberOfMatches(int n) {
        return comt(n);
    }
    int comt(int n)
    {
        if(n==1) return 0;
        else if(n%2==0) return (n/2)+comt(n/2);
        else    return ((n-1)/2)+comt(((n-1)/2)+1);
    }
}