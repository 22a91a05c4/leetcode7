class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++)
        {
            String str = Integer.toString(i);
            if(str.length()%2!=0)
            {
                continue;
            }
            else
            {
                int hal=str.length()/2;
                int left=0;
                int right=0;
                for(int j=0;j<hal;j++)
                {
                    left+=str.charAt(j)-'0';
                }
                for(int j=hal;j<str.length();j++)
                {
                    right+=str.charAt(j)-'0';
                }
                if(left==right)
                {
                    c++;
                }
            }
        }
        return c;
    }
}