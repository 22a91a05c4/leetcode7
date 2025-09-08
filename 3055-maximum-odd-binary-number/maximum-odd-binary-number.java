class Solution {
    public String maximumOddBinaryNumber(String s) {
        String st = "";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == '1') 
            {
                c++;
            }
        }
        for(int i=1;i<c;i++)
        {
            st=st+"1";
        }
        for(int i=0;i<(s.length()-c);i++)
        {
            st=st+"0";
        }
        st=st+"1";
        return st;
    }
}