class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : nums)
        {
            hs.add(i);
            int s=0;
            while(i!=0)
            {
                int r = i%10;
                s=s*10+r;
                i=i/10;
            }
            hs.add(s);
        }
        return hs.size();
    }
}