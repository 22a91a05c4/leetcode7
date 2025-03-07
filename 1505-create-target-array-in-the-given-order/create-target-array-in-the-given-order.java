class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] targ = new int[nums.length];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            targ[i]=al.get(i);
        }
        return targ;
    }
}