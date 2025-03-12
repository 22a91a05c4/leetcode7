class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int c=0;
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()%2==0)
            {
                c++;
            }
        }
        if(c==hm.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}