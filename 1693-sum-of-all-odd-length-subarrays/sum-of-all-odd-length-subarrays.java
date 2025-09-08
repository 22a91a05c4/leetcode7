class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totsum=0;
        for(int i=1;i<=arr.length;i=i+2)
        {
            int subsum=0;
            for(int j=0;j<=arr.length-i;j++)
            {
                for(int k=j;k<j+i;k++)
                {
                    subsum=subsum+arr[k];
                }
            }
            totsum+=subsum;
        }
        return totsum;
    }
}