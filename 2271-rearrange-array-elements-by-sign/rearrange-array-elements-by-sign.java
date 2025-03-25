class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int hl=nums.length/2;
        /*ArrayList<Integer> ps = new ArrayList<Integer>();
        ArrayList<Integer> ne = new ArrayList<Integer>();
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
        }*/
        int pi=0;
        int ni=1;
        for(int i:nums)
        {
            if(i>0) 
            {
                ans[pi]=i;
                pi+=2;
            }
            else
            {
                ans[ni]=i;
                ni+=2;
            }
        }
        return ans;
    }
}