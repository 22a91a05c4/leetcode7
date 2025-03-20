class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int ans=0;
        for(int i : nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int val = (nums.length)/2;
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()==val)
            {
                ans = i.getKey();
            }
        }
        return ans;
    }
}