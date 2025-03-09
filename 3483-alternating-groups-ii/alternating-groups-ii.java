class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int c=1;
        int s=0;
        int n=colors.length;
        for(int i=1;i<n+k-1;i++)
        {
            if(colors[i%n]!=colors[(i-1)%n])
            {
                c++;
            }
            else
            {
                c=1;
            }
            if(c>=k)
            {
                s++;
            }
            //System.out.println("i: " + i + ", color: " + colors[i % n] + ", currentLength: " + c + ", count: " + s);
        }
        return s;
    }
}