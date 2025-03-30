class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.size();i++)
        {
            int cnt=Integer.bitCount(i);
            /*while(i>0)
            {
                cnt+=(i & 1);
                i>>=1;
            }*/
            if(cnt==k)
            {
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}