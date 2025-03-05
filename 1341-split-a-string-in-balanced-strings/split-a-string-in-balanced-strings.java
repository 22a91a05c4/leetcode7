class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int ll=0;
        int rr=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                rr++;
            }
            else if(s.charAt(i)=='L')
            {
                ll++;
            }
            if(rr==ll)
            {
                c++;
                rr=0;
                ll=0;
            }
        }
        return c;
    }
}