class Solution {
    public int alternateDigitSum(int n) {
        int pos=0;
        int neg=0;
        int temp=n;
        int r;
        int numsize =(int) Math.log10(n)+1;
        int[] arr = new int[numsize];
        int i=numsize-1;
        while(temp!=0)
        {
            r=temp%10;
            arr[i]=r;
            i--;
            temp=temp/10;
        }
        for(int j=0;j<numsize;j++)
        {
            if(j==0 || j%2==0)
            {
                pos=pos+arr[j];
            }
            else
            {
                neg=neg+arr[j];
            }
        }
        return pos-neg;
    }
}