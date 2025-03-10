class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int c=0;
            String bin = Integer.toBinaryString(i);
            for(char ch : bin.toCharArray())
            {
                if(ch=='1')
                {
                    c++;
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}