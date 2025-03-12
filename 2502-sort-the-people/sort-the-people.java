class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> nh = new HashMap<Integer,String>();
        String[] ans = new String[names.length];
        for(int i=0;i<heights.length;i++)
        {
            nh.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int k=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            ans[k]=nh.get(heights[i]);
            k++;
        }
        return ans;
    }
}