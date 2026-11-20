class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=0;
        int b=0;
        for(int i=1;i<=(n*2);i=i+2)
        {
            a=a+i;
            b=b+i+1;
        }
        System.out.println(a);
        System.out.println(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}