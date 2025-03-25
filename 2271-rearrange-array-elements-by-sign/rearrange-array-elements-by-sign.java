class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> ps = new ArrayList<Integer>();
        ArrayList<Integer> ne = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        int hl=nums.length/2;
        for(int i : nums)
        {
            if(i<0)
            {
                ne.add(i);
            }
            else
            {
                ps.add(i);
            }
        }
        int k=0;
        for(int i=0;i<hl;i++)
        {
            ans[k++]=ps.get(i);
            ans[k++]=ne.get(i);
        }
        return ans;
    }
}