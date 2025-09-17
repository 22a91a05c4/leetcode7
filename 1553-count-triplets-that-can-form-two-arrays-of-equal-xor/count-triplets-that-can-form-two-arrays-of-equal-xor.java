class Solution {
    public int countTriplets(int[] arr) {
        int c=0;
        for(int i=0;i<(arr.length-1);i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j;k<arr.length;k++)
                {
                    int a=0;
                    int b=0;
                    int tem=i;
                    int pem=j;
                    while(tem<=j-1)
                    {
                        a=a^arr[tem];
                        tem++;
                    }
                    while(pem<=k)
                    {
                        b=b^arr[pem];
                        pem++;
                    }
                    if(a==b)
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}