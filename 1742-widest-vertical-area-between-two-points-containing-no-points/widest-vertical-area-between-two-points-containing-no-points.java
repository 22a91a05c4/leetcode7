class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        /*ArrayList<Integer> al = new ArrayList<Integer>();*/
        int[] arr = new int[points.length];
        for(int i=0;i<points.length;i++)
        {
            /*al.add(points[i][0]);*/
            arr[i]=points[i][0];
        }
        /*Collections.sort(al);*/
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i</*al.size()*/arr.length-1;i++)
        {
            /*int temp=al.get(i+1)-al.get(i);
            if(max<temp)
            {
                max=temp;
            }*/
        
            /*max=Math.max(max,al.get(i+1)-al.get(i));*/
            max=Math.max(max,arr[i+1]-arr[i]);
        }
        return max;
    }
}