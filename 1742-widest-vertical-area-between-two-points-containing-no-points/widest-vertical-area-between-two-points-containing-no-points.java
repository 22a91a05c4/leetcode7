class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<points.length;i++)
        {
            al.add(points[i][0]);
        }
        Collections.sort(al);
        int max=0;
        for(int i=0;i<al.size()-1;i++)
        {
            int temp=al.get(i+1)-al.get(i);
            if(max<temp)
            {
                max=temp;
            }
        }
        return max;
    }
}