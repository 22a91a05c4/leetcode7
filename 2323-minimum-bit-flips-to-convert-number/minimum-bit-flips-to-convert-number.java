class Solution {
    public int minBitFlips(int start, int goal) {
        int c=0;
        int xor = start ^ goal;
        String s1 =Integer.toBinaryString(xor);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1')   c++;
        }
        return c;
    }
}