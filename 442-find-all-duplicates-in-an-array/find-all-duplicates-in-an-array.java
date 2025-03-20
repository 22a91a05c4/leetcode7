class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i : nums)
        {
            if(hs.contains(i))  al.add(i);
            else    hs.add(i);
        }
        return al;
    }
}