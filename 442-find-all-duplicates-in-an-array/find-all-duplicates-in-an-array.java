class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        /*for(int i : nums)
        {
            if(hs.contains(i))  al.add(i);
            else    hs.add(i);
        }*/
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])  al.add(nums[i]);
        }
        return al;
    }
}