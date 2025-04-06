class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int pows=1<<n;
        for(int v=0;v<pows;v++)
        {
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if((v & (1<<i))!=0) ls.add(nums[i]);
            }
            ans.add(ls);
        }
        return ans;
    }
}