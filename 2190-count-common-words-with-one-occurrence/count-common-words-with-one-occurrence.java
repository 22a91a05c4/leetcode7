class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        for(String s : words1)
        {
            hm1.put(s,hm1.getOrDefault(s,0)+1);
        }
        for(String s : words2)
        {
            hm2.put(s,hm2.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> i : hm1.entrySet())
        {
            if(i.getValue()==1)
            {
                if(hm2.containsKey(i.getKey()))
                {
                    if(hm2.get(i.getKey())==1)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}