class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] arr = new int[2];
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
        int pn=0;
        int ln=0;
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()%2!=0)
            {
                ln++;
            }
        }
        pn=(nums.length-ln)/2;
        arr[0]=pn;
        arr[1]=ln;
        return arr;
    }
}