class Solution {
    public String stringHash(String s, int k) {
        String result = "";
        for(int i=0;i<s.length();i+=k)
        {
            int hv=0;
            int sol=0;
            for(int j=i;j<i+k;j++)
            {
                char ch=s.charAt(j);
                int val =(int) ch;
                hv+=(val-97);
            }
            sol=(hv%26)+97;
            char b = (char) sol;
            result=result+b;
        }
        return result;
    }
}