class Solution {
    public int heightChecker(int[] heights) {
        int[] sa = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            sa[i]=heights[i];
        }
        Arrays.sort(heights);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=sa[i])
            {
                c++;
            }
        }
        return c;
    }
}