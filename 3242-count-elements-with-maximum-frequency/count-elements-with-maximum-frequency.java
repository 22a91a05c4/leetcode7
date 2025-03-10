class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
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
        int max=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()>=max)
            {
                max=i.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()==max)
            {
                al.add(i.getKey());
            }
        }
        System.out.println(al.size());
        return (max*al.size());
    }
}