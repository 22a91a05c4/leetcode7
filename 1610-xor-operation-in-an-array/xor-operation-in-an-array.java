class Solution {
    public int xorOperation(int n, int start) {
        int xor=start+2*0;
        for(int i=1;i<n;i++)
        {
            xor=start+2*i ^ xor;
        }
        return xor;
    }
}