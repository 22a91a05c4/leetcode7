class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> les = new ArrayList<Integer>();
        ArrayList<Integer> mid = new ArrayList<Integer>();
        ArrayList<Integer> gre = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                les.add(nums[i]);
            }
            else if(nums[i]==pivot)
            {
                mid.add(nums[i]);
            }
            else
            {
                gre.add(nums[i]);
            }
        }
        les.addAll(mid);
        les.addAll(gre);
        for(int i=0;i<les.size();i++)
        {
            ans[i]=les.get(i);
        }
        return ans;
    }
}